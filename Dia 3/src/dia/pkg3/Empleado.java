/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg3;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Empleado {
    private String nombre;
    private Date fechaVinculacion;
    private double salario;
    private AdministrativoInfo administrativoInfo;
    private TecnicoInfo tecnicoInfo;
    private OperacionesInfo operacionesInfo;
    public enum TipoEmpleado{
       Administrativo, Tecnico, Operaciones
    }
    private TipoEmpleado tipoEmpleado;
    // Se crea un constructor, getters y setters
    public Empleado(String nombre, Date fechaVinculacion, double salario, TipoEmpleado tipoEmpleado){
        this.nombre = nombre;
        this.fechaVinculacion = fechaVinculacion;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    // Clases internar para información especifica de cada tipo de empleado
     public static class AdministrativoInfo {
        // Atributos específicos para administrativos
    }

    public static class TecnicoInfo {
        // Atributos específicos para técnicos
    }

    public static class OperacionesInfo {
        // Atributos específicos para operaciones
    }
}