/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg1;

import java.util.ArrayList;
     
/**
 *
 * @author camper
 */

public class RutaEntrenamiento {
    private Ruta ruta;
    private ArrayList<Modulo> modulos;
    private int capacidad;
    private Trainer trainer;
    private ArrayList<Camper> campersAsignados;

    public RutaEntrenamiento(Ruta ruta, int capacidad, Trainer trainer) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.trainer = trainer;
        this.modulos = new ArrayList<>();
        this.campersAsignados = new ArrayList<>();
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void agregarModulo(Modulo modulo) {
        this.modulos.add(modulo);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Camper> getCampersAsignados() {
        return campersAsignados;
    }

    public boolean agregarCamper(Camper camper) {
        if (this.campersAsignados.size() < this.capacidad) {
            this.campersAsignados.add(camper);
            return true;
        }
        return false;
    }
}