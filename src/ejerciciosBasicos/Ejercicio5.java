package ejerciciosBasicos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe el radio del círculo:");
        Integer inputRadio = input.nextInt();

        System.out.println("El area del círculo es:");
        System.out.println(Ejercicio5.areaCirculo(inputRadio));
    }

    public static Double areaCirculo(Integer radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
