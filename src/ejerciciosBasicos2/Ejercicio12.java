package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number:");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("The number " + number + " has " + String.valueOf(number).length() + " digit");
        } else {
            System.out.println("The number " + number + " has " + String.valueOf(number).length() + " digits");
        }
    }
}
