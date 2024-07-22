/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg1;

/**
 *
 * @author camper
 */
public enum Ruta {
    NODEJS("Ruta NodeJS"),
    JAVA("Ruta Java"),
    NETCORE("Ruta NetCore");

    private String nombre;

    Ruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
