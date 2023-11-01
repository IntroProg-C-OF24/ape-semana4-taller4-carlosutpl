
import java.util.Scanner;

/**
 *
 * Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar
 * de un número ingresado por el usuario; solo en el caso que el valor del
 * número esté entre 2 y 6.
 */
public class EjercicioTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero del 2 al 6");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + numero);
        System.out.println(numero * 1);
        System.out.println(numero * 2);
        System.out.println(numero * 3);
        System.out.println(numero * 4);
        System.out.println(numero * 5);
        System.out.println(numero * 6);
        System.out.println(numero * 7);
        System.out.println(numero * 8);
        System.out.println(numero * 9);
        System.out.println(numero * 10);
        System.out.println(numero * 11);
        System.out.println(numero * 12);

    }
}
