import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa la carrera y gestiona los pilotos y equipos participantes.
 */
public class Carrera {
    private List<Piloto> pilotos;
    private List<Equipo> equipos;

    /**
     * Constructor de la clase Carrera.
     */
    public Carrera() {

        this.pilotos = new ArrayList<>();

        this.equipos = new ArrayList<>();

    }

    /**
     * Añade un nuevo piloto a la carrera.
     *
     * @param scanner Scanner para obtener datos del usuario.
     */
    public void añadirPiloto(Scanner scanner) {

        System.out.print("Ingrese el nombre del piloto: ");

        String nombre = scanner.nextLine();

        Piloto piloto = new Piloto(nombre);

        System.out.print("Ingrese el nombre del equipo: ");

        String nombreEquipo = scanner.nextLine();

        Equipo equipo = buscarEquipo(nombreEquipo);

        if (equipo == null) {

            equipo = new Equipo(nombreEquipo);

            equipos.add(equipo);

        }

        equipo.añadirPiloto(piloto);

        pilotos.add(piloto);

    }

    /**
     * Muestra la lista de pilotos en la carrera.
     */
    public void mostrarPilotos() {

        System.out.println("\nLista de pilotos:");

        for (Piloto piloto : pilotos) {

            System.out.println(piloto.getNombre());

        }
    }

    /**
     * Muestra la clasificación de pilotos en la carrera.
     */
    public void mostrarClasificacionPilotos() {

        // Método para generar una clasificación de pilotos.

    }

    /**
     * Muestra la clasificación de equipos en la carrera.
     */
    public void mostrarClasificacionEquipos() {

        // Método para generar una clasificación de equipos.

    }

    /**
     * Busca un equipo por su nombre.
     *
     * @param nombreEquipo Nombre del equipo a buscar.
     * @return Equipo encontrado o null si no se encontró ningún equipo con el nombre dado.
     */
    private Equipo buscarEquipo(String nombreEquipo) {

        for (Equipo equipo : equipos) {

            if (equipo.getNombre().equals(nombreEquipo)) {

                return equipo;

            }
        }return null;
    }
}
