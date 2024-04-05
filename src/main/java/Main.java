import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static PrintStream Salida = new PrintStream(System.out,true, StandardCharsets.UTF_8);

    public static void main(String[] args) {

        // Crear un objeto Scanner para la entrada del usuario

        Scanner leer = new Scanner(System.in);

        // Crear una lista para almacenar los nombres de los pilotos

        ArrayList<String> pilotos = new ArrayList<>();

        // Solicitar al usuario que ingrese nombres de pilotos hasta que ingrese "fin"

            System.out.println("Ingrese nombres de pilotos:");

            String nombrePiloto;

        for (int i = 0; i < 10; i++) {

            nombrePiloto = leer.nextLine();

            // Añadimos el nombre del piloto a la lista

            pilotos.add(nombrePiloto);

        }

        // Imprimir los nombres de los pilotos almacenados

        System.out.println("\nLista de pilotos:");

        for (String piloto : pilotos) {

            Salida.println(piloto);

        }
    }
}

