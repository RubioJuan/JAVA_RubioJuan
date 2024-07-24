/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg3;

/**
 *
 * @author camper
 */
public class Doctor {
    private int id;
    private String nombre;
    private String especialidad;
    private int aynosExperiencia;
    private int departamentoId; // Referencia al departamento al que pertemenece
    
    // Constructor
    public Doctor(int id, String nombre, String especialidad, int aynosExperiencia, int departamentoId) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.aynosExperiencia = aynosExperiencia;
        this.departamentoId = departamentoId;
    }
      // Getters y Setters
    public int getId() {
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnosExperiencia() {
        return aynosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.aynosExperiencia = anosExperiencia;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

    // Método para representar al doctor como una cadena de texto
    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", anosExperiencia=" + aynosExperiencia +
                ", departamentoId='" + departamentoId + '\'' +
                '}';
    }
}
