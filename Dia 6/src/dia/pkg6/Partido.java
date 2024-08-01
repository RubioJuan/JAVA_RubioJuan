/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg6;

import java.time.LocalDate;

/**
 *
 * @author camper
 */

public abstract class Partido {
    protected String equipoLocal;
    protected String equipoVisitante;
    protected int cestasLocal;
    protected int cestasVisitante;
    protected boolean haFinalizado;
    protected LocalDate fecha;
    
public Partido(String equipoLocal, String equipoVisitante, LocalDate fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.cestasLocal = 0;
        this.cestasVisitante = 0;
        this.haFinalizado = false;
    }

    public String obtenerInformacionBasica() {
        return String.format("Partido: %s vs %s, Fecha: %s, Finalizado: %s",
                equipoLocal, equipoVisitante, fecha, haFinalizado ? "Sí" : "No");
    }

    public void registrarPuntosLocal(int puntos) {
        if (!haFinalizado) {
            cestasLocal += puntos;
        }
    }

    public void registrarPuntosVisitante(int puntos) {
        if (!haFinalizado) {
            cestasVisitante += puntos;
        }
    }

    public String obtenerGanador() {
        if (cestasLocal > cestasVisitante) {
            return equipoLocal;
        } else if (cestasVisitante > cestasLocal) {
            return equipoVisitante;
        } else {
            return "Empate";
        }
    }

    public void finalizarPartido() {
        if (!haFinalizado && !esEmpate()) {
            haFinalizado = true;
        }
    }

    public abstract boolean esEmpate();
}