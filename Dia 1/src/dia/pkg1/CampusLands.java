/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author camper
 */

public class CampusLands {
    private ArrayList<Camper> campers;
    private ArrayList<RutaEntrenamiento> rutasEntrenamiento;

    public CampusLands() {
        this.campers = new ArrayList<>();
        this.rutasEntrenamiento = new ArrayList<>();
    }

    // Métodos para gestionar campers
    public void agregarCamper(Camper camper) {
        this.campers.add(camper);
    }

    public Camper buscarCamper(String id) {
        for (Camper camper : campers) {
            if (camper.getId().equals(id)) {
                return camper;
            }
        }
        return null; // o lanzar una excepción si no se encuentra
    }

    public void eliminarCamper(String id) {
        Camper camper = buscarCamper(id);
        if (camper != null) {
            this.campers.remove(camper);
        }
    }

    public void actualizarCamper(Camper camperActualizado) {
        Camper camper = buscarCamper(camperActualizado.getId());
        if (camper != null) {
            camper.setNombres(camperActualizado.getNombres());
            camper.setApellidos(camperActualizado.getApellidos());
            camper.setDireccion(camperActualizado.getDireccion());
            camper.setAcudiente(camperActualizado.getAcudiente());
            camper.setTelefonoCelular(camperActualizado.getTelefonoCelular());
            camper.setTelefonoFijo(camperActualizado.getTelefonoFijo());
            camper.setEstado(camperActualizado.getEstado());
            camper.setRiesgo(camperActualizado.getRiesgo());
        }
    }

    // Métodos para gestionar rutas de entrenamiento
    public void agregarRutaEntrenamiento(RutaEntrenamiento ruta) {
        this.rutasEntrenamiento.add(ruta);
    }

    public RutaEntrenamiento buscarRutaEntrenamiento(Ruta ruta) {
        for (RutaEntrenamiento rutaEntrenamiento : rutasEntrenamiento) {
            if (rutaEntrenamiento.getRuta() == ruta) {
                return rutaEntrenamiento;
            }
        }
        return null; // o lanzar una excepción si no se encuentra
    }

    public void asignarRutaACamper(String idCamper, Ruta ruta) {
        Camper camper = buscarCamper(idCamper);
        RutaEntrenamiento rutaEntrenamiento = buscarRutaEntrenamiento(ruta);

        if (camper != null && rutaEntrenamiento != null) {
            if (camper.getEstado().equals("Aprobado") && rutaEntrenamiento.getCapacidad() > rutaEntrenamiento.getCampersAsignados().size()) {
                boolean asignado = rutaEntrenamiento.agregarCamper(camper);
                if (asignado) {
                    camper.setEstado("Cursando");
                    System.out.println("Camper " + camper.getNombres() + " asignado a la " + ruta.getNombre());
                } else {
                    System.out.println("No hay capacidad en la ruta " + ruta.getNombre());
                }
            } else {
                System.out.println("El camper no está aprobado o la ruta no tiene capacidad disponible.");
            }
        } else {
            System.out.println("Camper o ruta no encontrados.");
        }
    }
    // Métodos para registrar evaluaciones y actualizar estados
    public void registrarEvaluacion(String idCamper, Evaluacion evaluacion) {
        Camper camper = buscarCamper(idCamper);
        if (camper != null && camper.getEstado().equals("Cursando")) {
            double notaFinal = evaluacion.calcularNotaFinal();
            if (notaFinal >= 60) {
                camper.setEstado("Aprobado");
                System.out.println("Camper " + camper.getNombres() + " ha aprobado con una nota final de " + notaFinal);
            } else {
                camper.setEstado("Rendimiento Bajo");
                System.out.println("Camper " + camper.getNombres() + " tiene un rendimiento bajo con una nota final de " + notaFinal);
            }
        } else {
            System.out.println("Camper no encontrado o no está cursando.");
        }
    }
   // Métodos de reportes
    public List<Camper> listarCampersInscritos() {
        return campers.stream()
                      .filter(camper -> camper.getEstado().equals("Inscrito"))
                      .collect(Collectors.toList());
    }

    public List<Camper> listarCampersAprobados() {
        return campers.stream()
                      .filter(camper -> camper.getEstado().equals("Aprobado"))
                      .collect(Collectors.toList());
    }

    public List<Trainer> listarTrainers() {
        return rutasEntrenamiento.stream()
                                 .map(RutaEntrenamiento::getTrainer)
                                 .distinct()
                                 .collect(Collectors.toList());
    }

    public List<Camper> listarCampersBajoRendimiento() {
        return campers.stream()
                      .filter(camper -> camper.getEstado().equals("Rendimiento Bajo"))
                      .collect(Collectors.toList());
    }

    public List<String> listarCampersYTrainersPorRuta() {
        List<String> reporte = new ArrayList<>();
        for (RutaEntrenamiento ruta : rutasEntrenamiento) {
            String info = "Ruta: " + ruta.getRuta().getNombre() + ", Trainer: " + ruta.getTrainer().getNombres() + " " + ruta.getTrainer().getApellidos();
            info += ", Campers: " + ruta.getCampersAsignados().stream()
                                        .map(camper -> camper.getNombres() + " " + camper.getApellidos())
                                        .collect(Collectors.joining(", "));
            reporte.add(info);
        }
        return reporte;
    }

    public List<String> reporteResultadosPorModulo() {
        List<String> reporte = new ArrayList<>();
        for (RutaEntrenamiento ruta : rutasEntrenamiento) {
            for (Modulo modulo : ruta.getModulos()) {
                long campersAprobados = ruta.getCampersAsignados().stream()
                                             .filter(camper -> camper.getEstado().equals("Aprobado"))
                                             .count();
                long campersPerdidos = ruta.getCampersAsignados().size() - campersAprobados;
                String info = "Ruta: " + ruta.getRuta().getNombre() + ", Modulo: " + modulo.getNombre() +
                              ", Trainer: " + ruta.getTrainer().getNombres() + " " + ruta.getTrainer().getApellidos() +
                              ", Aprobados: " + campersAprobados + ", Perdidos: " + campersPerdidos;
                reporte.add(info);
            }
        }
        return reporte;
    }
}