
import java.util.*;

/**
 *
 * Generar un algoritmo que permite ingresar los gastos de tres hijos de un
 * padre de familia; calcular y mostrar el total de gastos de los hijos del
 * padre de familia.
 */
public class EjercicioDos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el gasto del primer hijo");
        double gastoHijo1 = sc.nextDouble();

        System.out.println("Introduce el gasto del segundo hijo");
        double gastoHijo2 = sc.nextDouble();

        System.out.println("Introduce el gasto del tercer hijo");
        double gastoHijo3 = sc.nextDouble();

        double gastosTotales = gastoHijo1 + gastoHijo2 + gastoHijo3;

        System.out.println("Los gatos de los tres hijos es: " + gastosTotales);
    }
}
