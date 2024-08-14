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

public class SuperHero extends juego{
    private String arma;

     public SuperHero(String nombre, String habilidad, String arma) {
        super(nombre, habilidad);
        this.arma = arma;
    }

     @Override
    public void guardarEnBaseDeDatos() {
        Conexion conexion = new Conexion();
        Connection con = conexion.conectarMySQL();
        
        String sql = "INSERT INTO juegos (nombre, habilidad, arma, tipo, haFinalizado) VALUES (?, ?, ?, 'SuperHero', ?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, habilidad);
            stmt.setString(3, arma);
            stmt.setBoolean(4, haFinalizado);
            stmt.executeUpdate();
            System.out.println("SuperHero guardado en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al guardar el SuperHero en la base de datos: " + e);
        }
    }
    
    @Override
    public String mostrarInformacion() {
        return String.format("Nombre: %s, Habilidad: %s, Arma: %s, Finalizado: %s",
                nombre, habilidad, arma, haFinalizado ? "Sí" : "No");
    }
}
