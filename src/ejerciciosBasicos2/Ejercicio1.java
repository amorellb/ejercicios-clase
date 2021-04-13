package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number:");
        int number = input.nextInt();

        System.out.println("The character of the ASCII code " + number + " is:");
        System.out.println((char)number);
    }
}
