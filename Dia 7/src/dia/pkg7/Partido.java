/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg7;

import java.time.LocalDate;

/**
 *
 * @author Juan Felipe Rubio
 */

public abstract class Partido {
 private String equipoLocal;
    private String equipoVisitante;
    private int cestasLocal;
    private int cestasVisitante;
    private boolean haFinalizado;
    private LocalDate fecha;

    public Partido(String equipoLocal, String equipoVisitante, LocalDate fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.cestasLocal = 0;
        this.cestasVisitante = 0;
        this.haFinalizado = false;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getCestasLocal() {
        return cestasLocal;
    }

    public int getCestasVisitante() {
        return cestasVisitante;
    }

    public boolean isHaFinalizado() {
        return haFinalizado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void finalizarPartido() {
        this.haFinalizado = true;
    }

    public abstract String obtenerGanador();

    public String obtenerInformacionBasica() {
        return "Local: " + equipoLocal + ", Visitante: " + equipoVisitante + ", Fecha: " + fecha;
    }
}