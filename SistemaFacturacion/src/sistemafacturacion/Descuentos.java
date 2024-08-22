/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafacturacion;

import java.util.function.Function;

/**
 *
 * @author Juan Felipe Rubio
 */

public class Descuentos {
    public static final Function<Double, Double> DESCUENTO_VIP = total -> total * 0.9;  // 10% de descuento
    public static final Function<Double, Double> DESCUENTO_REGULAR = total -> total * 0.95;  // 5% de descuento
    public static final Function<Double, Double> DESCUENTO_SIN_APLICAR = total -> total;  // Sin descuento
}
