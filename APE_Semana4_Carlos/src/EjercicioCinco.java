
import java.util.Scanner;

/**
 *
 * Generar un algoritmo que permita calcular y mostrar el costos de una
 * computadora de escritorio. La misma es comprada por partes; CPU, teclado,
 * pantalla, ratón.
 */
public class EjercicioCinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el precio de CPU");
        double precioCpu = sc.nextDouble();

        System.out.println("Escriba el precio de teclado");
        double precioTeclado = sc.nextDouble();

        System.out.println("Escriba el precio de la pantalla");
        double precioPantalla = sc.nextDouble();

        System.out.println("Escriba el precio del raton");
        double precioRaton = sc.nextDouble();

        double precioTotal = precioCpu + precioPantalla + precioRaton + precioTeclado;

        System.out.println("El precio de la computadora es: " + precioTotal);
    }
}
