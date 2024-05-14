import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa a un piloto en la carrera.
 */

public class Piloto {
    private String nombre;
    private int puntos;

    /**
     * Constructor de la clase Piloto.
     *
     * @param nombre Nombre del piloto.
     */
    public Piloto(String nombre) {

        this.nombre = nombre;

        this.puntos = 0;

    }

    // Getters y setters para nombre y puntos
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getPuntos() {return puntos;}

    public void setPuntos(int puntos) {this.puntos = puntos;}

    /**
     * Suma puntos al total de puntos del piloto.
     *
     * @param puntos Puntos a sumar.
     */
    public void sumarPuntos(int puntos) {this.puntos += puntos;}

}
