package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Write a number:");
            number = input.nextInt();
        } while (number < 0);

        System.out.println("The last number is: " + number);
    }
}
