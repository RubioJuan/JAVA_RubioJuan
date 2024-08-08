/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg10;

/**
 *
 * @author Juan Felipe Rubio
 */

public class Singleton {
    // Variable estática que contiene la única instancia de la clase
    private static Singleton instance;

    // Constructor privado para evitar la creación de objetos desde fuera de la clase
    private Singleton() {}

    // Método estático para obtener la única instancia de la clase
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("¡Hola desde el Singleton!");
    }
}



