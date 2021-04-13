package ejerciciosBasicos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un número:");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("El número SÍ es divisible entre 2.");
        } else {
            System.out.println("El número NO es divisible entre 2.");
        }
    }
}
