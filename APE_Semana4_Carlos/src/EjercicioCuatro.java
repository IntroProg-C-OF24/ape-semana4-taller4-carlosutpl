
import java.util.Scanner;

/**
 *
 * Generar un algoritmo que permita calcular y mostrar el valor de la planilla
 * de teléfono de un casa. Se debe ingresar el costo por minutos, el número de
 * minutos consumidos en el mes.
 */
public class EjercicioCuatro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el costo por minuto del telefono");
        double costoPorMinutos = sc.nextDouble();

        System.out.println("Introduzca los minutos consumidos en el mes");
        double minutosAlMes = sc.nextDouble();

        double costeTotal = costoPorMinutos * minutosAlMes;

        System.out.println("El valor de la plantilla es: " + costeTotal);
    }
}
