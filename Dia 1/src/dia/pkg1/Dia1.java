/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg1;

/**
 *
 * @author camper
 */

import java.util.List;

public class Dia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     CampusLands campusLands = new CampusLands();

        // Crear un camper y agregarlo a CampusLands
        Camper camper = new Camper("1", "John", "Doe", "123 Street", "Guardian", "123456789", "987654321", "Cursando", "Bajo");
        campusLands.agregarCamper(camper);

        // Crear una evaluación
        Evaluacion evaluacion = new Evaluacion(70, 80, 50);

        // Registrar la evaluación para el camper
        campusLands.registrarEvaluacion("1", evaluacion);
        
        // Generar reportes
        List<Camper> inscritos = campusLands.listarCampersInscritos();
        System.out.println("Campers inscritos: " + inscritos);

        List<Camper> aprobados = campusLands.listarCampersAprobados();
        System.out.println("Campers aprobados: " + aprobados);

        List<Trainer> trainers = campusLands.listarTrainers();
        System.out.println("Trainers: " + trainers);

        List<Camper> bajoRendimiento = campusLands.listarCampersBajoRendimiento();
        System.out.println("Campers con bajo rendimiento: " + bajoRendimiento);

        List<String> campersYTrainersPorRuta = campusLands.listarCampersYTrainersPorRuta();
        System.out.println("Campers y Trainers por ruta: " + campersYTrainersPorRuta);

        List<String> resultadosPorModulo = campusLands.reporteResultadosPorModulo();
        System.out.println("Resultados por modulo: " + resultadosPorModulo);
    }
}
 
    

