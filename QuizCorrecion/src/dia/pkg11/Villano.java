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

public class Villano extends juego{
    private String raza;
    
    public Villano(String nombre, String habilidad, String raza) {
        super(nombre, habilidad);
        this.raza = raza;
    }

    @Override
    public void guardarEnBaseDeDatos() {
        Conexion conexion = new Conexion();
        Connection con = conexion.conectarMySQL();
        
        String sql = "INSERT INTO juegos (nombre, habilidad, raza, tipo, haFinalizado) VALUES (?, ?, ?, 'Villano', ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, habilidad);
            stmt.setString(3, raza);
            stmt.setBoolean(4, haFinalizado);
            stmt.executeUpdate();
            System.out.println("Villano guardado en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al guardar el Villano en la base de datos: " + e);
        }
    }

    
    @Override
    public String mostrarInformacion() {
        return String.format("Nombre: %s, Habilidad: %s, Raza: %s, Finalizado: %s",
                nombre, habilidad, raza, haFinalizado ? "Sí" : "No");
    }
}
