package javaapplication1;
import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number: ");
        Float num1 = scanner.nextFloat();

        System.out.println("Insert the second number: ");
        Float num2 = scanner.nextFloat();

        if (num1 > num2) {
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
            System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
        } else if (num1 < num2) {
            System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
            System.out.println("The result of the division of " + num1 + " and " + num2 + " is " + (num1 / num2));
        } else {
            System.out.println("The numbers are the equals");
        }
    }
}
