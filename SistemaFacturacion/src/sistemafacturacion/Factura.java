/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafacturacion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Juan Felipe Rubio
 */

public class Factura {
    private int id;
    private Cliente cliente;
    private Function<Double, Double> estrategiaDescuento;
    private List<Producto> productos;

    public Factura(int id, Cliente cliente, Function<Double, Double> estrategiaDescuento) {
        this.id = id;
        this.cliente = cliente;
        this.estrategiaDescuento = estrategiaDescuento;
        this.productos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Function<Double, Double> getEstrategiaDescuento() {
        return estrategiaDescuento;
    }

    public void setEstrategiaDescuento(Function<Double, Double> estrategiaDescuento) {
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", estrategiaDescuento=" + estrategiaDescuento +
                ", productos=" + productos +
                '}';
    }
}