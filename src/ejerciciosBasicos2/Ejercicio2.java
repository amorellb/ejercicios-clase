package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a letter:");
        char letter = input.nextLine().charAt(0);

        System.out.println("The ASCII code of the letter " + letter + " is:");
        System.out.println((int) letter);
    }
}
