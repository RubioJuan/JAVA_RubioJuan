/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg3;

/**
 *
 * @author camper
 */
public class Pabellon {
    private int id;
    private String nombre;
    private int capacidad;
    private int pacientesActuales;
    private String especialidad;
    private String estado;
    
    // Constructor
    public Pabellon(int id, String nombre, int capacidad, String especialidad, String estado){
         this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pacientesActuales = 0; // Inicialmente, ningún paciente
        this.especialidad = especialidad;
        this.estado = estado;
    }
    
    // Getters y Setters
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPacientesActuales() {
        return pacientesActuales;
    }

    public void setPacientesActuales(int pacientesActuales) {
        this.pacientesActuales = pacientesActuales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para representar el pabellón como una cadena de texto
    @Override
    public String toString() {
        return "Pabellon{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", pacientesActuales=" + pacientesActuales +
                ", especialidad='" + especialidad + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
