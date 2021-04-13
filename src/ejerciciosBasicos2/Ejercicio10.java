package ejerciciosBasicos2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un día de la semana");
        String day = input.nextLine();

        switch (day.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                System.out.println("El " + day + " es día laboral");
                break;
            case "sábado":
            case "domingo":
                System.out.println("El " + day + " no es día laboral");
                break;
            default:
                System.out.println("No has introducido un día de la semana");
                break;
        }
    }
}
