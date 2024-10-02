package javaapplication1;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {0, 0, 0};

        System.out.println("Insert a number between 1 and 99:");
        numbers[0] = scanner.nextInt();
        System.out.println("Insert a number between 1 and 99:");
        numbers[1] = scanner.nextInt();
        System.out.println("Insert a number between 1 and 99:");
        numbers[2] = scanner.nextInt();

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("El mayor numero es " + max);
    }
}
