/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Juan Felipe Rubio
 */

public class juego {
    protected String nombre;
    protected String habilidad;
    protected boolean haFinalizado;
  
    public juego(String nombre, String habilidad){
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.haFinalizado = false;
    }
    
    // Conexión con MySQLs
    public void guardarEnBaseDeDatos(){
        Conexion conexion = new Conexion();
        Connection con = conexion.conectarMySQL();
        
        String sql = "INSERT INTO juegos (nombre, habilidad, haFinalizado) VALUES (?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)){
        stmt.setString(1, nombre);
            stmt.setString(2, habilidad);
            stmt.setBoolean(3, haFinalizado);
            stmt.executeUpdate();
            System.out.println("Juego guardado en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al guardar el juego en la base de datos: " + e);
        }
    }
    
public String mostrarInformacion() {
        return String.format("Nombre: %s con un %s, arma: %s, de raza: %s, Finalizado: %s",
                nombre, habilidad, haFinalizado ? "Sí" : "No");
    }
}
