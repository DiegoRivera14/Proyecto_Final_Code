import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Carrera {
    private List<Piloto> pilotos;
    private List<Equipo> equipos;
    public Carrera() {

        this.pilotos = new ArrayList<>();

        this.equipos = new ArrayList<>();

    }
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
    public void mostrarPilotos() {

        System.out.println("\nLista de pilotos:");

        for (Piloto piloto : pilotos) {

            System.out.println(piloto.getNombre());

        }
    }
    public void mostrarClasificacionPilotos() {

        // Método para generar una clasificación de pilotos.

    }
    public void mostrarClasificacionEquipos() {

        // Método para generar una clasificación de equipos.

    }
    private Equipo buscarEquipo(String nombreEquipo) {

        for (Equipo equipo : equipos) {

            if (equipo.getNombre().equals(nombreEquipo)) {

                return equipo;

            }
        }return null;
    }
}
