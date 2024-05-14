import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Piloto {
    private String nombre;
    private int puntos;
    public Piloto(String nombre) {

        this.nombre = nombre;

        this.puntos = 0;

    }

    // Getters y setters para nombre y puntos
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getPuntos() {return puntos;}

    public void setPuntos(int puntos) {this.puntos = puntos;}

    public void sumarPuntos(int puntos) {this.puntos += puntos;}

}
