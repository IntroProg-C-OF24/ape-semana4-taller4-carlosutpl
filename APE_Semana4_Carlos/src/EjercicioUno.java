
import java.util.*;

/**
 * Generar un algoritmo que permite calcular y presentar el área de un
 * triángulo. Los datos deben ser pedidos al usuario.
 */

public class EjercicioUno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
          
        System.out.println("Introduzca la base del triangulo");
        double baseTriangulo = sc.nextDouble();

        System.out.println("Introduzca la altura del triangulo");
        double alturaTriangulo = sc.nextDouble();

        double area = (baseTriangulo * alturaTriangulo) / 2;

        System.out.println("El area del triangulo es: " + area);
        
    }

}
