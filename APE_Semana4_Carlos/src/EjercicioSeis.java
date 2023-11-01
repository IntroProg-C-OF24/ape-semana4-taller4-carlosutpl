
import java.util.Scanner;

/**
 *
 * Generar una solución que permita calcular y mostrar el pago mensual de un
 * préstamo de 1 año de plazo. Se debe ingresar el monto del préstamo y el
 * interés mensual a cobrar.
 */
public class EjercicioSeis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el monto del prestamo");
        double montoPrestamo = sc.nextDouble();

        System.out.println("Introduzca el interes mensual");
        double interesMensual = sc.nextDouble();

        double tarifaMensual = montoPrestamo / 12; //Obtener el costo por mes
        double pagoMensual = tarifaMensual + ((tarifaMensual * interesMensual) / 100); //Anadir al pago mensual el porcentaje *interesMensual*
        
        
        System.out.println("El pago mensual del prestamo es: " + pagoMensual);
    }
}
