/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg11;

/**
 *
 * @author Juan Felipe Rubio
 */

public class Villano extends juego{
    private String raza;
    
    public Villano(String nombre, String habilidad, String raza) {
        super(nombre, habilidad);
        this.raza = raza;
    }

    @Override
    public String mostrarInformacion() {
        return String.format("Nombre: %s, Habilidad: %s, Raza: %s, Finalizado: %s",
                nombre, habilidad, raza, haFinalizado ? "Sí" : "No");
    }
}
