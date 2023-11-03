
import java.util.Scanner;

/**
 *
 * Generar un algoritmo que permita calcular y mostrar el valor a cancelar de
 * una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y
 * el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor
 * a 65 años, se debe descontar el 10%.
 */
public class EjercicioSiete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor de costo por kilovatio/hora");
        double kilovatioHora = sc.nextDouble();

        System.out.println("Introduzca el valor de los kilovatios consumidos en el mes ");
        double kilovatiosMes = sc.nextDouble();

        System.out.println("Introduzca la edad del usuario");
        int edadUsuario = sc.nextInt();

        double plantillaLuz = kilovatioHora * kilovatiosMes;
        
        if(edadUsuario > 65){
            plantillaLuz = plantillaLuz - (plantillaLuz / 10); //Eliminar el 10% de la plantilla
        }
        
        System.out.println("El costo de la plantilla de luz es de: " + plantillaLuz);
    }
}
