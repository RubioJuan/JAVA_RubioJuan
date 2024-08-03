/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg7;

import java.time.LocalDate;

/**
 *
 * @author camper
 */

public class PartidoLiga extends Partido{
    private int jornada;

    public PartidoLiga(String equipoLocal, String equipoVisitante, LocalDate fecha, int jornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada;
    }

    public int getJornada() {
        return jornada;
    }

    @Override
    public String obtenerGanador() {
        if (getCestasLocal() > getCestasVisitante()) {
            return getEquipoLocal();
        } else if (getCestasVisitante() > getCestasLocal()) {
            return getEquipoVisitante();
        } else {
            return "Empate";
        }
    }
}