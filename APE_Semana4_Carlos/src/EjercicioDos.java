import java.util.*;
/**
 *
 * Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia;
 * calcular y mostrar el total de gastos de los hijos del padre de familia.
 */
public class EjercicioDos {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Introduce el gasto del primer hijo");
         int gastoHijo1 = sc.nextInt();
         
          System.out.println("Introduce el gasto del segundo hijo");
         int gastoHijo2 = sc.nextInt();
         
          System.out.println("Introduce el gasto del tercer hijo");
         int gastoHijo3 = sc.nextInt();
         
         System.out.println("Los gatos de los tres hijos es: " + (gastoHijo1 + gastoHijo2 + gastoHijo3));
    }
}
