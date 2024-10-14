package javaapplication1;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Float degree1;
        Float degree2;
        Float degree3;
        do {
            System.out.println("Insert the first degree: ");
            degree1 = scanner.nextFloat();

            System.out.println("Insert the second degree: ");
            degree2 = scanner.nextFloat();

            System.out.println("Insert the third degree: ");
            degree3 = scanner.nextFloat();
        } while (((degree1 + degree2 + degree3)/3) < 0 && ((degree1 + degree2 + degree3)/3) > 10);


        if (((degree1 + degree2 + degree3)/3) >= 7) {
            System.out.println("Promoted");
        } else if (((degree1 + degree2 + degree3)/3) >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Not promoted");
        }
    }
}
