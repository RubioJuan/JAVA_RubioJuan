/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafacturacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Juan Felipe Rubio
 */
public class SistemaFacturacion {

    private static Connection conexion;

    public static void main(String[] args) {
        // Conectar a la base de datos
        Conexion conexionBD = new Conexion();
        conexion = conexionBD.conectarMySQL();

        if (conexion == null) {
            System.out.println("No se pudo establecer la conexión con la base de datos.");
            return;
        }

        ClienteDAO clienteDAO = new ClienteDAO(conexion);
        FacturaDAO facturaDAO = new FacturaDAO(conexion);
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de cliente (VIP o Regular): ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();

        Cliente cliente = clienteDAO.insertarCliente(nombre, tipo, direccion);

        if (cliente == null) {
            System.out.println("No se pudo crear el cliente. Saliendo...");
            return;
        }

        System.out.println("Cliente creado exitosamente: " + cliente);

        // Crear la factura para el cliente
        Factura factura = facturaDAO.crearFactura(cliente, 0.0);  // Total inicial en 0.0

        if (factura == null) {
            System.out.println("No se pudo crear la factura. Saliendo...");
            return;
        }

        System.out.println("Factura creada exitosamente: " + factura);

        int opcion;
        do {
            System.out.println("=== Sistema de Facturación ===");
            System.out.println("1. Agregar Producto a Factura");
            System.out.println("2. Calcular Total de la Factura");
            System.out.println("3. Cambiar Descuento del Cliente");
            System.out.println("4. Ver Detalle de la Factura");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ID del producto: ");
                    int idProducto = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingresa el precio del producto: ");
                    double precioProducto = scanner.nextDouble();

                    Producto producto = new Producto(idProducto, nombreProducto, precioProducto);
                    factura.agregarProducto(producto);
                    facturaDAO.agregarDetalleFactura(factura, producto, 1);  // Cantidad por defecto en 1
                    System.out.println("Producto agregado: " + producto);
                    break;
                case 2:
                    double total = facturaDAO.calcularTotalFactura(factura);
                    System.out.println("Total de la factura: " + total);
                    break;
                case 3:
                    cambiarDescuento(scanner, factura);
                    break;
                case 4:
                    mostrarDetallesFactura(facturaDAO, factura);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);

        // Cerrar la conexión a la base de datos
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.err.println("Error cerrando la conexión: " + e.getMessage());
        }
    }

    private static void cambiarDescuento(Scanner scanner, Factura factura) {
        System.out.println("Selecciona el tipo de descuento para el cliente:");
        System.out.println("1. Descuento VIP (10%)");
        System.out.println("2. Descuento Regular (5%)");
        System.out.println("3. Sin Descuento");
        System.out.print("Elige una opción: ");
        int opcionDescuento = scanner.nextInt();

        switch (opcionDescuento) {
            case 1:
                factura.setEstrategiaDescuento(Descuentos.DESCUENTO_VIP);
                System.out.println("Descuento VIP aplicado.");
                break;
            case 2:
                factura.setEstrategiaDescuento(Descuentos.DESCUENTO_REGULAR);
                System.out.println("Descuento Regular aplicado.");
                break;
            case 3:
                factura.setEstrategiaDescuento(Descuentos.DESCUENTO_SIN_APLICAR);
                System.out.println("Sin descuento aplicado.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void mostrarDetallesFactura(FacturaDAO facturaDAO, Factura factura) {
        System.out.println("Detalles de la factura:");
        for (DetalleFactura detalle : facturaDAO.obtenerDetallesFactura(factura.getId())) {
            System.out.println(detalle);
        }
    }
}
