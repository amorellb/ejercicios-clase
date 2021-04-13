package ejerciciosBasicos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        String nombre = input.nextLine();

        System.out.println("Bienvenido " + nombre + "!");
    }
}
