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

public class PartidoLiga extends Partido{
  private int jornada;

    public PartidoLiga(String equipoLocal, String equipoVisitante, LocalDate fecha, int jornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada;
    }

    @Override
    public boolean esEmpate() {
        return cestasLocal == cestasVisitante;
    }
}
