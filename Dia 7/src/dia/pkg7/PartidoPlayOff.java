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
public class PartidoPlayOff extends Partido{
    private String ronda;

    public PartidoPlayOff(String equipoLocal, String equipoVisitante, LocalDate fecha, String ronda) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }

    public String getRonda() {
        return ronda;
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