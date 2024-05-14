import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static PrintStream Salida = new PrintStream(System.out,true, StandardCharsets.UTF_8);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <String> pilotos = new ArrayList<>();

        Salida.println("Ingrese nombres de pilotos:");

        for (int i = 0; i < 10; i++) {

            pilotos.add(scanner.nextLine());

        }

        Salida.println("\nLista de pilotos:");

        for (String piloto : pilotos) {

            Salida.println(piloto);

        }
    }
}

