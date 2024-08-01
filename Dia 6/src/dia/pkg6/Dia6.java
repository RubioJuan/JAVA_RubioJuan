/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Dia6 {
private ArrayList<Partido> partidos;

    public Dia6() {
        partidos = new ArrayList<>();
    }

    public void registrarPartido() {
        System.out.println("\n Continueee....");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRegistrar nuevo partido:");
        System.out.println("1. Partido de Liga");
        System.out.println("2. Partido PlayOff");
        int tipo = sc.nextInt();
        sc.nextLine(); // Consumes the newline character

        System.out.print("Equipo Local: ");
        String equipoLocal = sc.nextLine();
        System.out.print("Equipo Visitante: ");
        String equipoVisitante = sc.nextLine();
        System.out.print("Fecha (yyyy-mm-dd): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        if (tipo == 1) {
            System.out.print("Jornada: ");
            int jornada = sc.nextInt();
            PartidoLiga partido = new PartidoLiga(equipoLocal, equipoVisitante, fecha, jornada);
            partidos.add(partido);
        } else if (tipo == 2) {
            System.out.print("Ronda: ");
            String ronda = sc.nextLine();
            PartidoPlayOff partido = new PartidoPlayOff(equipoLocal, equipoVisitante, fecha, ronda);
            partidos.add(partido);
        }
    }  public void finalizarPartido() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número del partido a finalizar: ");
        int numero = sc.nextInt();
        
        if (numero >= 0 && numero < partidos.size()) {
            Partido partido = partidos.get(numero);
            partido.finalizarPartido();
            System.out.println("Partido finalizado.");
        } else {
            System.out.println("Número de partido inválido.");
        }
    }

    public void mostrarGanador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el número del partido para mostrar el ganador: ");
        int numero = sc.nextInt();
        
        if (numero >= 0 && numero < partidos.size()) {
            Partido partido = partidos.get(numero);
            String ganador = partido.obtenerGanador();
            System.out.println("El ganador es: " + ganador);
        } else {
            System.out.println("Número de partido inválido.");
        }
    }

    public void mostrarInformacionPartido() {
        for (int i = 0; i < partidos.size(); i++) {
            Partido partido = partidos.get(i);
            System.out.println("Partido " + i + ": " + partido.obtenerInformacionBasica());
        }
    }

    public static void main(String[] args) {
        Dia6 sistema = new Dia6 ();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nHola, bienvenido al mejor partido de su gran puta vida");
            System.out.println("\n1. Registrar Partido");
            System.out.println("2. Finalizar Partido");
            System.out.println("3. Mostrar Ganador");
            System.out.println("4. Mostrar Información de Partidos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sistema.registrarPartido();
                    break;
                case 2:
                    sistema.finalizarPartido();
                    break;
                case 3:
                    sistema.mostrarGanador();
                    break;
                case 4:
                    sistema.mostrarInformacionPartido();
                    break;
                case 5:
                    System.out.println("Vmz...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}