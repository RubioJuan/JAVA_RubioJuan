/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg1;

/**
 *
 * @author camper
 */

public class Evaluacion {
    private double notaTeorica;
    private double notaPractica;
    private double notaAdicional; // Quizes, trabajos, etc.

    public Evaluacion(double notaTeorica, double notaPractica, double notaAdicional) {
        this.notaTeorica = notaTeorica;
        this.notaPractica = notaPractica;
        this.notaAdicional = notaAdicional;
    }

    public double getNotaTeorica() {
        return notaTeorica;
    }

    public void setNotaTeorica(double notaTeorica) {
        this.notaTeorica = notaTeorica;
    }

    public double getNotaPractica() {
        return notaPractica;
    }

    public void setNotaPractica(double notaPractica) {
        this.notaPractica = notaPractica;
    }

    public double getNotaAdicional() {
        return notaAdicional;
    }

    public void setNotaAdicional(double notaAdicional) {
        this.notaAdicional = notaAdicional;
    }

    public double calcularNotaFinal() {
        return (notaTeorica * 0.3) + (notaPractica * 0.6) + (notaAdicional * 0.1);
    }
}