/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg11;

/**
 *
 * @author Juan Felipe Rubio
 */

public class juego {
    protected String nombre;
    protected String habilidad;
    protected boolean haFinalizado;
  
    public juego(String nombre, String habilidad){
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.haFinalizado = false;
    }
public String mostrarInformacion() {
        return String.format("Nombre: %s con un %s, arma: %s, de raza: %s, Finalizado: %s",
                nombre, habilidad, haFinalizado ? "Sí" : "No");
    }
}
