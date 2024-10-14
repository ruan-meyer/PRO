package javaapplication1;

import java.util.Scanner;

public class Act11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the fist number:");
        int number1 = scanner.nextInt();

        System.out.println("Insert the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Insert the third number:");
        int number3 = scanner.nextInt();

        if (number1 < 10 && number2 < 10 && number3 < 10) {
            System.out.println("All numbers are less than 10");
        } else if (number1 < 10 || number2 < 10 || number3 < 10) {
            System.out.println("Some numbers are less than 10");
        } else {
            System.out.println("No number is less than 10");
        }
    }
}
