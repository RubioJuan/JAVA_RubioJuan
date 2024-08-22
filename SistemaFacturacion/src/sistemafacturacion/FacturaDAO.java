/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafacturacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Felipe Rubio
 */

public class FacturaDAO {

    private Connection conexion;

    public FacturaDAO(Connection conexion) {
        this.conexion = conexion;
    }
 public List<DetalleFactura> obtenerDetallesFactura(int facturaId) {
        List<DetalleFactura> detalles = new ArrayList<>();
        String query = "SELECT p.nombre, p.precio, df.cantidad " +
                       "FROM DetallesFactura df " +
                       "JOIN Productos p ON df.producto_id = p.id " +
                       "WHERE df.factura_id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, facturaId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String nombreProducto = rs.getString("nombre");
                    double precioProducto = rs.getDouble("precio");
                    int cantidad = rs.getInt("cantidad");
                    detalles.add(new DetalleFactura(nombreProducto, precioProducto, cantidad));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los detalles de la factura: " + e.getMessage());
        }
        return detalles;
    }

    public Factura crearFactura(Cliente cliente, double total) {
        Factura factura = null;
        String query = "INSERT INTO Facturas(cliente_id, total) VALUES(?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, cliente.getId());
            stmt.setDouble(2, total);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int id = generatedKeys.getInt(1);
                        factura = new Factura(id, cliente, Descuentos.DESCUENTO_SIN_APLICAR); // Default discount
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al crear factura: " + e.getMessage());
        }
        return factura;
    }

    public void agregarDetalleFactura(Factura factura, Producto producto, int cantidad) {
        if (!productoExiste(producto.getId())) {
            System.err.println("El producto con ID " + producto.getId() + " no existe.");
            return;
        }

        String query = "INSERT INTO DetallesFactura(factura_id, producto_id, cantidad) VALUES(?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, factura.getId());
            stmt.setInt(2, producto.getId());
            stmt.setInt(3, cantidad);
            stmt.executeUpdate();
            System.out.println("Detalle agregado a la factura.");
        } catch (SQLException e) {
            System.err.println("Error al agregar detalle a la factura: " + e.getMessage());
        }
    }

    private boolean productoExiste(int productoId) {
    String query = "SELECT COUNT(*) FROM Productos WHERE id = ?";
    try (PreparedStatement stmt = conexion.prepareStatement(query)) {
        stmt.setInt(1, productoId);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al verificar existencia del producto: " + e.getMessage());
    }
    return false;
}


    public double calcularTotalFactura(Factura factura) {
        double total = 0.0;
        String query = "SELECT p.precio, df.cantidad " +
                       "FROM DetallesFactura df " +
                       "JOIN Productos p ON df.producto_id = p.id " +
                       "WHERE df.factura_id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, factura.getId());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    double precio = rs.getDouble("precio");
                    int cantidad = rs.getInt("cantidad");
                    total += precio * cantidad;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al calcular el total de la factura: " + e.getMessage());
        }
        return factura.getEstrategiaDescuento().apply(total);
    }
}
