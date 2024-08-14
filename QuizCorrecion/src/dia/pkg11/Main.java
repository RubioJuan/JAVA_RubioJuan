/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Felipe Rubio
 */

public class Main {
    private ArrayList<juego> juegos;
    private static final int MAX_VILLANOS = 5;
    private boolean superHeroeCreado = false;

    public Main() {
        juegos = new ArrayList<>();
    }

    private int contarVillanos() {
        int count = 0;
        for (juego personaje : juegos) {
            if (personaje instanceof Villano) {
                count++;
            }
        }
        return count;
    }

    private boolean haySuperHeroe() {
        return superHeroeCreado;
    }

    public void registrarPersonaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRegistrar Personaje:");
        System.out.println("1. Super Heroe");
        System.out.println("2. Villano");
        int tipo = sc.nextInt();
        sc.nextLine(); // Consume el carácter de nueva línea

        if (tipo == 1) {
            if (haySuperHeroe()) {
                System.out.println("Ya existe un SuperHéroe en el juego.");
                return;
            }
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Habilidad: ");
            String habilidad = sc.nextLine();
            System.out.print("Arma: ");
            String arma = sc.nextLine();
            SuperHero superHero = new SuperHero(nombre, habilidad, arma);
            juegos.add(superHero);
            superHeroeCreado = true;
            superHero.guardarEnBaseDeDatos();
        } else if (tipo == 2) {
            if (contarVillanos() >= MAX_VILLANOS) {
                System.out.println("Se ha alcanzado el límite de villanos.");
                return;
            }
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Habilidad: ");
            String habilidad = sc.nextLine();
            System.out.print("Raza: ");
            String raza = sc.nextLine();
            Villano villano = new Villano(nombre, habilidad, raza);
            juegos.add(villano);
            villano.guardarEnBaseDeDatos();
        } else {
            System.out.println("Tipo de personaje no válido.");
        }
    }

    public void salirGravityfalls() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número del personaje a finalizar: ");
        int numero = sc.nextInt();
        
        if (numero >= 0 && numero < juegos.size()) {
            juego personaje = juegos.get(numero);
            personaje.haFinalizado = true;
            System.out.println("Saliste de la serie.. vil no te atrapo.");
        } else {
            System.out.println("Número de personaje inválido.");
        }
    }

    public void mostrarInformacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el número del personaje para mostrar la información: ");
        int numero = sc.nextInt();
        
        if (numero >= 0 && numero < juegos.size()) {
            juego personaje = juegos.get(numero);
            System.out.println(personaje.mostrarInformacion());
        } else {
            System.out.println("Número de personaje inválido.");
        }
    }

    public void mostrarInformacionJuego() {
        for (int i = 0; i < juegos.size(); i++) {
            juego personaje = juegos.get(i);
            System.out.println("Personaje " + i + ": " + personaje.mostrarInformacion());
        }
    }
public static void main(String[] args) {
        Main sistema = new Main();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nHola, Bienvenido a gravity falls");
            System.out.println("\n1. Registrar Personaje");
            System.out.println("2. Salir de gravity falls");
            System.out.println("3. Mostrar Información de personaje");
            System.out.println("4. Mostrar todos los personajes");
            System.out.println("5. Salir del juego");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sistema.registrarPersonaje();
                    break;
                case 2:
                    sistema.salirGravityfalls();
                    break;
                case 3:
                    sistema.mostrarInformacion();
                    break;
                case 4:
                    sistema.mostrarInformacionJuego();
                    break;
                case 5:
                    System.out.println("Game Over...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
