/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg11;

/**
 *
 * @author Juan Felipe Rubio
 */

public class SuperHero extends juego{
    private String arma;

     public SuperHero(String nombre, String habilidad, String arma) {
        super(nombre, habilidad);
        this.arma = arma;
    }

    @Override
    public String mostrarInformacion() {
        return String.format("Nombre: %s, Habilidad: %s, Arma: %s, Finalizado: %s",
                nombre, habilidad, arma, haFinalizado ? "Sí" : "No");
    }
}
