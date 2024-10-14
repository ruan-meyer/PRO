package javaapplication1;

import java.util.Scanner;

public class Act15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year:");
        float year = scanner.nextFloat();

        if (year % 4f == 0f) {
            if (year % 100f == 0f && year % 400f != 0f) {
                System.out.println("The years isn't a leap year");
            } else {
                System.out.println("The year is a lap year");
            }
        } else {
            System.out.println("The years isn't a leap year");
        }
    }
}
