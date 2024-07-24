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
public class Paciente {
    private int id;
    private String nombre;
    private Date fechaNacimiento;
    private int edad;
    private Date fechaIngreso;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String email;
    private String tipoSangre;
    private String condicionesMedicas;
    private String alergias;
    private String tratamientosActuales;
    private String historialVisitas;
    private String historialDiagnosticos;
    private String historialTratamientos;
    private int pabellonId;
    private int doctorId;
    private String seguroMedico;

    // Constructor
    public Paciente(int id, String nombre, Date fechaNacimiento, int edad, Date fechaIngreso, String identificacion, String direccion, String telefono, String email, String tipoSangre, String condicionesMedicas, String alergias, String tratamientosActuales, String historialVisitas, String historialDiagnosticos, String historialTratamientos, int pabellonId, int doctorId, String seguroMedico) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoSangre = tipoSangre;
        this.condicionesMedicas = condicionesMedicas;
        this.alergias = alergias;
        this.tratamientosActuales = tratamientosActuales;
        this.historialVisitas = historialVisitas;
        this.historialDiagnosticos = historialDiagnosticos;
        this.historialTratamientos = historialTratamientos;
        this.pabellonId = pabellonId;
        this.doctorId = doctorId;
        this.seguroMedico = seguroMedico;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getCondicionesMedicas() {
        return condicionesMedicas;
    }

    public void setCondicionesMedicas(String condicionesMedicas) {
        this.condicionesMedicas = condicionesMedicas;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getTratamientosActuales() {
        return tratamientosActuales;
    }

    public void setTratamientosActuales(String tratamientosActuales) {
        this.tratamientosActuales = tratamientosActuales;
    }

    public String getHistorialVisitas() {
        return historialVisitas;
    }

    public void setHistorialVisitas(String historialVisitas) {
        this.historialVisitas = historialVisitas;
    }

    public String getHistorialDiagnosticos() {
        return historialDiagnosticos;
    }

    public void setHistorialDiagnosticos(String historialDiagnosticos) {
        this.historialDiagnosticos = historialDiagnosticos;
    }

    public String getHistorialTratamientos() {
        return historialTratamientos;
    }

    public void setHistorialTratamientos(String historialTratamientos) {
        this.historialTratamientos = historialTratamientos;
    }

    public int getPabellonId() {
        return pabellonId;
    }

    public void setPabellonId(int pabellonId) {
        this.pabellonId = pabellonId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }
    
    // Método para representar al paciente como una cadena de texto
    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                ", fechaIngreso=" + fechaIngreso +
                ", identificacion='" + identificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", grupoSanguineo='" + tipoSangre + '\'' +
                ", condicionesMedicas='" + condicionesMedicas + '\'' +
                ", alergias='" + alergias + '\'' +
                ", tratamientosActuales='" + tratamientosActuales + '\'' +
                ", historialVisitas='" + historialVisitas + '\'' +
                ", historialDiagnosticos='" + historialDiagnosticos + '\'' +
                ", historialTratamientos='" + historialTratamientos + '\'' +
                ", pabellonId='" + pabellonId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", seguroMedico='" + seguroMedico + '\'' +
                '}';
    }
}