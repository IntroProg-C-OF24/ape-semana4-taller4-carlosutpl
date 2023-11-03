
import java.util.Scanner;

/**
 *
 * Se debe generar un algoritmo que permite calcular y mostrar el valor total a
 * pagar mensual de servicios digitales de una persona. Los servicios digitales
 * son: netflix, youtube premium, dropbox, spotify. Si la persona es menor a 30
 * años se descuenta el 20% del total mensual.
 */
public class EjercicioOcho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa valor a pagar de netflix");
        double pagoNetflix = sc.nextDouble();

        System.out.println("Ingresa valor a pagar de youtube premium");
        double pagoYoutube = sc.nextDouble();

        System.out.println("Ingresa valor a pagar de dropbox");
        double pagoDropbox = sc.nextDouble();

        System.out.println("Ingresa valor a pagar de spotify");
        double pagoSpotify = sc.nextDouble();

        System.out.println("Ingresa la edad del usuario");
        int edadUsuario = sc.nextInt();

        double costoTotal = pagoNetflix + pagoYoutube + pagoDropbox + pagoSpotify;

        if (edadUsuario < 30) {
            //Descontar el 20%.
            costoTotal = costoTotal - ((costoTotal * 20) / 100);
        }
        System.out.println("El valor de los servicios digitales a pagar es: " + costoTotal);
    }
}
