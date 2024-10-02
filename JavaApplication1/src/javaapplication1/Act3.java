package javaapplication1;
import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Insert a number between 1 and 99:");
            number = scanner.nextInt();
        }
        while (number < 1 || number > 99);

        if (number < 10) {
            System.out.println("The number has only one digit");
        } else {
            System.out.println("The number has two digits");
        }
    }
}
