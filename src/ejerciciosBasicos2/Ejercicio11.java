package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number:");
        int firstNumber = input.nextInt();

        System.out.println("Write another number:");
        int secondNumber = input.nextInt();

        for (int i = 0; i < 10; i++) {
            if (firstNumber < secondNumber) {
                System.out.println(Math.random() * (secondNumber - firstNumber) + firstNumber);
            }
            if (firstNumber > secondNumber) {
                System.out.println(Math.random() * (firstNumber - secondNumber) + secondNumber);
            }
        }
    }
}
