import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Clase principal que contiene el método main y gestiona el menú de la aplicación.
 */

public class Main {

    /**
     * Método principal que ejecuta el programa y muestra un menú de opciones al usuario.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */

    static PrintStream Salida = new PrintStream(System.out,true, StandardCharsets.UTF_8);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Carrera carrera = new Carrera();

        int opcion;

        do {

            mostrarMenu();

            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {

                case 1:

                    carrera.mostrarPilotos();

                    break;

                case 2:

                    carrera.añadirPiloto(scanner);

                    break;

                case 3:

                    carrera.mostrarClasificacionPilotos();

                    break;

                case 4:

                    carrera.mostrarClasificacionEquipos();

                    break;

                case 5:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opción no válida. Inténtalo de nuevo.");

            }
        } while (opcion != 5);
    }

    /**
     * Muestra el menú de opciones al usuario en la consola.
     */

    private static void mostrarMenu() {

        Salida.println("\n*** Menú ***");

        Salida.println("1. Ver pilotos");

        Salida.println("2. Añadir piloto");

        Salida.println("3. Ver clasificación de pilotos");

        Salida.println("4. Ver clasificación de equipos");

        Salida.println("5. Salir");

        Salida.print("Selecciona una opción: ");

    }

}

