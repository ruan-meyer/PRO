package javaapplication1;

import java.util.Scanner;

public class Act10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fist number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println((number1 + number2) * number3);
        }
    }
}
