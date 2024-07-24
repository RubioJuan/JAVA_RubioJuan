/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg3;

/**
 *
 * @author camper
 */
public class Hospital {
    private int id;    
    private String nombre;
    private String direccion;
    private int departamentoId;
    
    // Constructor
    public Hospital(int id, String nombre, String direccion, int departamentoId){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamentoId = departamentoId;
    }
    
    // Getters y Setters
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setId(String nombre){
        this.nombre = nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
     // Getters y setters de Nombre
    public int getDepartamento() {
        return departamentoId;
    }

    public void setNombre(int departamento) {
        this.departamentoId = departamento;
    }
    
     // Método para representar el hospital como una cadena de texto
    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", departamento='" + departamentoId + '\'' +
                '}';
    }
}
