package ejerciciosBasicos2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.useLocale(Locale.US);
        System.out.println("How many products have been sold?");
        int products = input.nextInt();

        double priceUnit;
        double finalPrice = 0;
        for (int i = 1; i <= products; i++) {
            System.out.println("Write the price of the product number " + i);
            priceUnit = input.nextDouble();
            finalPrice += priceUnit;
        }

        System.out.println("The total price is: " + finalPrice);
    }
}
