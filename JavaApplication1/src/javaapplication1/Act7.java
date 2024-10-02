package javaapplication1;

import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a 3 digits number: ");
        number = scanner.nextInt();
        if (number < 0 || number > 999) {
            do {
                System.out.print("Error: the number must have maximum 3 characters and be positive");
                System.out.print("Enter a 3 digits number: ");
                number = scanner.nextInt();
            } while (number < 0 || number > 999);
        }
    }
}
