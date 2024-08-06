/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacion;

/**
 *
 * @author Juan Felipe Rubio
 */
public class Employe {
     private String name;

    public Employe() {
    }

    public Employe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employe{" + "name=" + name + '}';
    }
    
}