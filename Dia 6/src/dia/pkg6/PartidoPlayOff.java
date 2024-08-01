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
public class PartidoPlayOff extends Partido{
  private String ronda;

    public PartidoPlayOff(String equipoLocal, String equipoVisitante, LocalDate fecha, String ronda) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }

    @Override
    public boolean esEmpate() {
        return false; // En PlayOff no puede haber empate
    }
}