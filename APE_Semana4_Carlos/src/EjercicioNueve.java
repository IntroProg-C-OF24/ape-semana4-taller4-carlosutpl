
import java.util.Scanner;

/**
 *
 * El programa debe calcular el área del polígono. La figura se compone de un
 * cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya
 * base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo
 * ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura
 * mide lo mismo que la altura de los triángulos. Se pide que haga un programa
 * que calcule el área total.
 */
public class EjercicioNueve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la medida de un lado del cuadrado");
        double ladoCuadrado = sc.nextDouble();

        System.out.println("Ingrese la altura de un lado del triángulo");
        double alturaTriangulo = sc.nextDouble();

        //Calcular el área de las 3 figuras
        double areaCuadrado = Math.pow(ladoCuadrado, 2);
        
        double areaTriangulos = ((ladoCuadrado * alturaTriangulo) / 2) * 3;
        
        double areaRectangulo = ladoCuadrado * alturaTriangulo;

        double areaTotal = areaCuadrado + areaTriangulos + areaRectangulo;
        
        System.out.println("El area de la figura es: " + areaTotal);
    }
}
