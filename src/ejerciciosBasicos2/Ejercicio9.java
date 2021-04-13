package ejerciciosBasicos2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
    public static final String password = "DAW1234";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write the password:");
        String userPass = input.nextLine();

        for (int i = 0; i < 3; i++) {
            if (userPass.equals(password)) {
                System.out.println("You are right! Congratulations!");
                break;
            } else {
                System.out.println("Write the password:");
                userPass = input.nextLine();
            }
        }
    }
}
