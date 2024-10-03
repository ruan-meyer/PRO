package javaapplication1;

import java.util.Scanner;

public class Act13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entra la nota del alumno:");
        int degree = scanner.nextInt();

        if (degree >= 9) {
            System.out.println("Sobresaliente");
        } else if (degree >= 7) {
            System.out.println("Notable");
        } else if (degree == 6) {
            System.out.println("Bien");
        } else if (degree == 5) {
            System.out.println("Suficiente");
        } else if (degree == 4) {
            System.out.println("Suspenso");
        } else if (degree <= 3) {
            System.out.println("Muy deficiente");
        }
    }
}
