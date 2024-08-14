/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg12;

/**
 *
 * @author Juan Felipe Rubio
 */


public class Main {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystemImpl();
        NewSystem newSystem = new Adapter(oldSystem);
        newSystem.newMethod(); // Llama al método antiguo a través del adaptador
    }
}
