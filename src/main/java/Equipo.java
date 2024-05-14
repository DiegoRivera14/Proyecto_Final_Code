import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private String nombre;
    private List<Piloto> pilotos;
    public Equipo(String nombre) {

        this.nombre = nombre;

        this.pilotos = new ArrayList<>();

    }

    // Getters y setters para nombre y pilotos
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public List<Piloto> getPilotos() {return pilotos;}

    public void setPilotos(List<Piloto> pilotos) {this.pilotos = pilotos;}
    public void añadirPiloto(Piloto piloto) {pilotos.add(piloto);}

    public int calcularPuntosEquipo() {

        int puntosTotales = 0;

        for (Piloto piloto : pilotos) {

            puntosTotales += piloto.getPuntos();

        }return puntosTotales;
    }
}
