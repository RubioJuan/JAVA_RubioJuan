/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg3;

/**
 *
 * @author camper
 */
public class Departamento {
    private int id;
    private String nombre;
    
    // Creación de un constructor
    public Departamento(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    // Getters y setters de Id
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    // Getters y setters de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      // Método para representar el departamento como una cadena de texto
    @Override
    public String toString() {
        return "Departamento{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
