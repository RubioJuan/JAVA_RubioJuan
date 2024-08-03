/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package dia.pkg7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Partido> partidos;

    public Main() {
        partidos = new ArrayList<>();
    }

    private void guardarPartidoEnBD(Partido partido) {
        Conexion conexion = new Conexion();
        Connection con = conexion.conectarMySQL();

        if (con != null) {
            try {
                // Inserta en la tabla Partido
                String queryPartido = "INSERT INTO Partido (equipoLocal, equipoVisitante, cestasLocal, cestasVisitante, haFinalizado, fecha, tipo) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmtPartido = con.prepareStatement(queryPartido, PreparedStatement.RETURN_GENERATED_KEYS);
                pstmtPartido.setString(1, partido.getEquipoLocal());
                pstmtPartido.setString(2, partido.getEquipoVisitante());
                pstmtPartido.setInt(3, partido.getCestasLocal());
                pstmtPartido.setInt(4, partido.getCestasVisitante());
                pstmtPartido.setBoolean(5, partido.isHaFinalizado());
                pstmtPartido.setDate(6, java.sql.Date.valueOf(partido.getFecha()));
                
                String tipoPartido;
                if (partido instanceof PartidoLiga) {
                    tipoPartido = "Liga";
                } else if (partido instanceof PartidoPlayOff) {
                    tipoPartido = "PlayOff";
                } else {
                    throw new IllegalArgumentException("Tipo de partido desconocido");
                }
                pstmtPartido.setString(7, tipoPartido);

                pstmtPartido.executeUpdate();

                // Obtiene el ID generado para el partido
                ResultSet generatedKeys = pstmtPartido.getGeneratedKeys();
                int partidoId = -1;
                if (generatedKeys.next()) {
                    partidoId = generatedKeys.getInt(1);
                }
                
                // Inserta en las tablas específicas según el tipo de partido
                if (partido instanceof PartidoLiga) {
                    String queryLiga = "INSERT INTO PartidoLiga (id, jornada) VALUES (?, ?)";
                    PreparedStatement pstmtLiga = con.prepareStatement(queryLiga);
                    pstmtLiga.setInt(1, partidoId);
                    pstmtLiga.setInt(2, ((PartidoLiga) partido).getJornada());
                    pstmtLiga.executeUpdate();
                } else if (partido instanceof PartidoPlayOff) {
                    String queryPlayOff = "INSERT INTO PartidoPlayOff (id, ronda) VALUES (?, ?)";
                    PreparedStatement pstmtPlayOff = con.prepareStatement(queryPlayOff);
                    pstmtPlayOff.setInt(1, partidoId);
                    pstmtPlayOff.setString(2, ((PartidoPlayOff) partido).getRonda());
                    pstmtPlayOff.executeUpdate();
                }

                System.out.println("Partido registrado en la base de datos.");
            } catch (SQLException e) {
                System.err.println("Error al guardar el partido en la base de datos: " + e);
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e);
                }
            }
        }
    }

    public void registrarPartido() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nRegistrar nuevo partido:");
        System.out.println("1. Partido de Liga");
        System.out.println("2. Partido PlayOff");
        int tipo = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.print("Equipo Local: ");
        String equipoLocal = sc.nextLine();
        System.out.print("Equipo Visitante: ");
        String equipoVisitante = sc.nextLine();
        System.out.print("Fecha (yyyy-mm-dd): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        Partido partido;
        if (tipo == 1) {
            System.out.print("Jornada: ");
            int jornada = sc.nextInt();
            partido = new PartidoLiga(equipoLocal, equipoVisitante, fecha, jornada);
        } else {
            System.out.print("Ronda: ");
            String ronda = sc.nextLine();
            partido = new PartidoPlayOff(equipoLocal, equipoVisitante, fecha, ronda);
        }

        partidos.add(partido);
        guardarPartidoEnBD(partido);  // Guarda el partido en la base de datos
    }

    public void finalizarPartido() {
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

    public void verPartidos() {
        Conexion conexion = new Conexion();
        Connection con = conexion.conectarMySQL();

        if (con != null) {
            try {
                String query = "SELECT * FROM Partido";
                PreparedStatement pstmt = con.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery();

                System.out.println("Partidos:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String equipoLocal = rs.getString("equipoLocal");
                    String equipoVisitante = rs.getString("equipoVisitante");
                    int cestasLocal = rs.getInt("cestasLocal");
                    int cestasVisitante = rs.getInt("cestasVisitante");
                    boolean haFinalizado = rs.getBoolean("haFinalizado");
                    LocalDate fecha = rs.getDate("fecha").toLocalDate();
                    String tipo = rs.getString("tipo");

                    System.out.println("ID: " + id + ", Equipo Local: " + equipoLocal + ", Equipo Visitante: " + equipoVisitante + ", Cestas Local: " + cestasLocal + ", Cestas Visitante: " + cestasVisitante + ", Ha Finalizado: " + haFinalizado + ", Fecha: " + fecha + ", Tipo: " + tipo);

                    if (tipo.equals("Liga")) {
                        query = "SELECT jornada FROM PartidoLiga WHERE id = ?";
                        pstmt = con.prepareStatement(query);
                        pstmt.setInt(1, id);
                        ResultSet rsLiga = pstmt.executeQuery();
                        if (rsLiga.next()) {
                            int jornada = rsLiga.getInt("jornada");
                            System.out.println("Jornada: " + jornada);
                        }
                    } else if (tipo.equals("PlayOff")) {
                        query = "SELECT ronda FROM PartidoPlayOff WHERE id = ?";
                        pstmt = con.prepareStatement(query);
                        pstmt.setInt(1, id);
                        ResultSet rsPlayOff = pstmt.executeQuery();
                        if (rsPlayOff.next()) {
                            String ronda = rsPlayOff.getString("ronda");
                            System.out.println("Ronda: " + ronda);
                        }
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error al recuperar los datos de los partidos: " + e);
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nHola, bienvenido al mejor partido de estos ultimos 10 años");
            System.out.println("\n1. Registrar Partido");
            System.out.println("2. Finalizar Partido");
            System.out.println("3. Mostrar Ganador");
            System.out.println("4. Mostrar Información de Partidos");
            System.out.println("5. Ver Partidos"); // Nueva opción
            System.out.println("6. Salir"); // Cambiado de 5 a 6
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
                    sistema.verPartidos(); // Llama al nuevo método
                    break;
                case 6:
                    System.out.println("Adiós...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
}
