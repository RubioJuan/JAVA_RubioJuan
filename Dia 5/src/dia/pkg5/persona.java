/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg5;
import dia.pkg5.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

/**
 *
 * @author camper
 */

public class persona {
    private final Conexion conexion;
    public persona(){
        conexion = new Conexion();
    }
    
    public static void Ingresar_persona(){
        persona dao = new persona();
        Scanner scanner = new Scanner(System.in);
        
        // Entrada
        System.out.println("Ingrese los datos de la persona con la que se ve en 5 años: ");
        
        // Id
        System.out.println("Id de la victima: ");
        String id = scanner.nextLine();
        int id_persona;
        try{
            id_persona = Integer.parseInt(id);
        } catch (NumberFormatException e){
            System.out.println("Ey....Recuerda que el Id debe ser un numero entero");
            return;
        }
        
        // Nombre
        System.out.println("Nombre de la victima: ");
        String nombre = scanner.nextLine();
        
        // Apellido
        System.out.println("Apellidos de la victima: ");
        String apellido = scanner.nextLine();
        
        // Telefono
        System.out.println("Telefono de la victima: ");
        String phone = scanner.nextLine();
        int telefono;
        try{
            telefono = Integer.parseInt(phone);
        } catch (NumberFormatException e){
            System.out.println("Ey....Recuerda que el numero debe ser un numero entero");
            return;
        }
        
        dao.ingresarPersona(id_persona, nombre, apellido, telefono);

    }
    
    public void ingresarPersona(int id, String nombre, String apellido, int telefono){
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try{
            conn = conexion.conectarMySQL();
            String query ="INSERT INTO persona (id_persona, nombre, apellido, telefono) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.setInt(4, telefono);
            pstmt.executeUpdate();
            System.out.println("Persona agregado correctamente.");
        }catch (SQLException e) {
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    
    public static void Ver_persona(){
        persona dao = new persona();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try{
            conn = dao.conexion.conectarMySQL();
            String query = "SELECT * FROM persona";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();
            
            System.out.println("Mira: ");
            while(rs.next()){
                int id_persona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int telefono = rs.getInt("telefono");
                System.out.println("ID: " + id_persona + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Telefono: " + telefono);
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar los datos de la persona: " + e.getMessage());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar el PreparedStatement: " + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
public static void Eliminar_persona() {
        persona.Ver_persona();
        persona dao = new persona();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del hospital a eliminar: ");
        int id_persona = scanner.nextInt();

        dao.eliminarPersona(id_persona);
    }

    public void eliminarPersona(int id_persona) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = conexion.conectarMySQL();
            String query = "DELETE FROM persona WHERE id_persona = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id_persona);
            int rowsAffected = pstmt.executeUpdate();
            int i = 0;
            while (i != 10){
                    System.out.println("");
                    i = 1 + i;
                }
            if (rowsAffected > 0) {
                System.out.println("Persona eliminada correctamente.");
            } else {
                System.out.println("No se encontró la persona con el ID especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar la persona: " + e.getMessage());
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar el PreparedStatement: " + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
            
        }
    }
}