/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Agregacion;

/**
 *
 * @author Juan Felipe Rubio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Department dept = new Department ("Engineering");
        Employe emp1 = new Employe ("mozo");
        Employe emp2 = new Employe ("daza");
        
        dept.addEmploye(emp2);
        dept.addEmploye(emp1);
        
        for (int i = 0; i<= dept.getEmployes().size();i++){
            System.out.println("");
        }
    }
   
}
