/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg5;
import java.util.Scanner;

/**
 *
 * @author camper
 */

public class Main {
 public static void main(String[] args) {
        boolean repeticion = true;
        Scanner scanner = new Scanner(System.in);
        while (repeticion){
                // Mostrar opciones al usuario
                System.out.println("Selecciona una opción:");
                System.out.println("1 - Opciones de la persona");
                // Capturar entrada del usuario
                int opcion = scanner.nextInt();
                int i = 0;
                while (i != 10){
                    System.out.println("");
                    i = 1 + i;
                }

                // Ejecutar la clase correspondiente según la opción
                switch (opcion) {
                    case 1 -> {
                        System.out.println("----- PERSONA -----");
                        System.out.println("1 - Agregar Persona");
                        System.out.println("2 - Ver persona");
                        System.out.println("3- Eliminar persona");

                        int opcion2 = scanner.nextInt();
                        i = 0;
                        while (i != 10){
                            System.out.println("");
                            i = 1 + i;
                        }
                        
                        switch (opcion2){
                    case 1 -> persona.Ingresar_persona();
                    case 2 -> persona.Ver_persona();
                    case 3 -> persona.Eliminar_persona();
                      }
                    }
        }
   }
 }
}