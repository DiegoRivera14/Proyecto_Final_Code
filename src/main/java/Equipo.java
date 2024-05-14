import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un equipo en la carrera.
 */
public class Equipo {
    private String nombre;
    private List<Piloto> pilotos;

    /**
     * Constructor de la clase Equipo.
     *
     * @param nombre Nombre del equipo.
     */
    public Equipo(String nombre) {

        this.nombre = nombre;

        this.pilotos = new ArrayList<>();

    }

    // Getters y setters para nombre y pilotos
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public List<Piloto> getPilotos() {return pilotos;}

    public void setPilotos(List<Piloto> pilotos) {this.pilotos = pilotos;}

    /**
     * Añade un piloto al equipo.
     *
     * @param piloto Piloto a añadir.
     */
    public void añadirPiloto(Piloto piloto) {pilotos.add(piloto);}

    /**
     * Calcula y devuelve los puntos totales del equipo sumando los puntos de todos sus pilotos.
     *
     * @return Puntos totales del equipo.
     */
    public int calcularPuntosEquipo() {

        int puntosTotales = 0;

        for (Piloto piloto : pilotos) {

            puntosTotales += piloto.getPuntos();

        }return puntosTotales;
    }
}
