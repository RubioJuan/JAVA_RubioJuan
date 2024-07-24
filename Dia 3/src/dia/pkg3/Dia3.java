/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Dia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Crear un formato de fecha para inicializar los atributos de fecha
     // Formato de Fecha: Utilizamos SimpleDateFormat para convertir las cadenas de fecha en objetos Date.
     SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
     /*
    Entrada de Datos: Se utilizan métodos de Scanner para leer la entrada del usuario para cada atributo del Paciente.

    Consumo de Salto de Línea: Después de leer un número con nextInt(), se usa scanner.nextLine() para consumir el salto de línea restante.

    Formato de Fecha: La fecha se lee como una cadena y se convierte en un objeto Date usando SimpleDateFormat.

    Modificación y Visualización: Después de la entrada inicial y la creación del objeto Paciente, se permite al usuario modificar algunos atributos y se muestra la información actualizada.   
     */
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar información al usuario
            System.out.print("Ingrese el ID del paciente: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese el nombre del paciente: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
            Date fechaNacimiento = dateFormat.parse(scanner.nextLine());

            System.out.print("Ingrese la edad del paciente: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese la fecha de ingreso (dd/MM/yyyy): ");
            Date fechaIngreso = dateFormat.parse(scanner.nextLine());

            System.out.print("Ingrese la identificación del paciente: ");
            String identificacion = scanner.nextLine();

            System.out.print("Ingrese la dirección del paciente: ");
            String direccion = scanner.nextLine();

            System.out.print("Ingrese el teléfono del paciente: ");
            String telefono = scanner.nextLine();

            System.out.print("Ingrese el email del paciente: ");
            String email = scanner.nextLine();

            System.out.print("Ingrese el tipo de sangre del paciente: ");
            String tipoSangre = scanner.nextLine();

            System.out.print("Ingrese las condiciones médicas del paciente: ");
            String condicionesMedicas = scanner.nextLine();

            System.out.print("Ingrese las alergias del paciente: ");
            String alergias = scanner.nextLine();

            System.out.print("Ingrese los tratamientos actuales del paciente: ");
            String tratamientosActuales = scanner.nextLine();

            System.out.print("Ingrese el historial de visitas del paciente: ");
            String historialVisitas = scanner.nextLine();

            System.out.print("Ingrese el historial de diagnósticos del paciente: ");
            String historialDiagnosticos = scanner.nextLine();

            System.out.print("Ingrese el historial de tratamientos del paciente: ");
            String historialTratamientos = scanner.nextLine();

            System.out.print("Ingrese el ID del pabellón: ");
            int pabellonId = scanner.nextInt();

            System.out.print("Ingrese el ID del doctor: ");
            int doctorId = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese el seguro médico del paciente: ");
            String seguroMedico = scanner.nextLine();

            // Crear la instancia de Paciente con la información proporcionada
            Paciente paciente = new Paciente(
                id, nombre, fechaNacimiento, edad, fechaIngreso, identificacion, direccion, telefono, email,
                tipoSangre, condicionesMedicas, alergias, tratamientosActuales, historialVisitas, historialDiagnosticos,
                historialTratamientos, pabellonId, doctorId, seguroMedico
            );

            // Mostrar la información del paciente
            System.out.println("\nInformación del paciente:");
            System.out.println(paciente.toString());

            // Modificar algunos atributos del paciente
            System.out.println("\nModificación de algunos atributos del paciente:");
            System.out.print("Ingrese la nueva dirección: ");
            paciente.setDireccion(scanner.nextLine());

            System.out.print("Ingrese el nuevo teléfono: ");
            paciente.setTelefono(scanner.nextLine());

            // Mostrar la información modificada del paciente
            System.out.println("\nInformación actualizada del paciente:");
            System.out.println(paciente.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close(); // Cerrar el scanner al final
        }
    }
}
/*        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Crear instancias de Paciente
            Paciente paciente1 = new Paciente(
                1, 
                "Juan Pérez", 
                dateFormat.parse("15/08/1985"), 
                39, 
                dateFormat.parse("20/07/2024"), 
                "123456789", 
                "Calle Falsa 123", 
                "555-1234", 
                "juan.perez@email.com", 
                "O+", 
                "Diabetes", 
                "Polen", 
                "Insulina", 
                "Visita a especialista en 2024", 
                "Diagnóstico de diabetes en 2024", 
                "Tratamiento con insulina desde 2024", 
                101, 
                202, 
                "Seguro Salud Plus"
            );

            // Mostrar la información del paciente
            System.out.println(paciente1.toString());

            // Modificar algunos atributos del paciente
            paciente1.setDireccion("Avenida Siempre Viva 742");
            paciente1.setTelefono("555-5678");

            // Mostrar la información modificada del paciente
            System.out.println("\nInformación actualizada del paciente:");
            System.out.println(paciente1.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/

/*
Mostrar Información: Usamos el método toString() para imprimir la información del paciente.
Modificar Atributos: Se actualizan algunos atributos del paciente y se muestra la información actualizada.
*/