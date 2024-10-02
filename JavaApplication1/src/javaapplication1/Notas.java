package javaapplication1;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first degree: ");
        Float degree1 = scanner.nextFloat();

        System.out.println("Insert the second degree: ");
        Float degree2 = scanner.nextFloat();

        System.out.println("Insert the third degree: ");
        Float degree3 = scanner.nextFloat();

        if (((degree1 + degree2 + degree3)/3) >= 7) {
            System.out.println("Promoted");
        } else {
            System.out.println("Not promoted");
        }
    }
}
