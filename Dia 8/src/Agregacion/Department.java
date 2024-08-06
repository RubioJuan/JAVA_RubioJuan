/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Felipe Rubio
 */
public class Department {
      private String name;
    private List<Employe> employes;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
        this.employes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    
    public void addEmploye(Employe employe){
        employes.add(employe);
    }
    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", employes=" + employes + '}';
    }
    
    
}