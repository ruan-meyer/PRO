package javaapplication1;

import java.util.Scanner;

public class Act9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number:");
        float number1 = scanner.nextFloat();

        System.out.println("Insert the first second:");
        float number2 = scanner.nextFloat();

        System.out.println("Insert the product");
        float product = scanner.nextFloat();

        if (number1 * number2 == product) {
            System.out.println("Correct");
        } else {
            System.out.println("Error");
            System.out.println(number1 + " * " + number2 + " = " + product);
        }
    }
}
