package ejerciciosBasicos2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Cambiamos el sistema de puntuación al de US para que lea los números decimales separados por punto*/
        input.useLocale(Locale.US);
        /*Leemos el valor*/
        System.out.println("Write the product price:");
        double price = input.nextFloat();

        /*Mostramos el resultado por pantalla*/
        System.out.println("The final price of the product is: " + (price + price * iva));
    }

    /*Definimos la constante iva*/
    public static final double iva = 0.21;
}
