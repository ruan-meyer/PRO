package bifurcacion;

import java.util.Scanner;

public class Act15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta el año:");
        float year = scanner.nextFloat();

        if (year % 4f == 0f) {
            if (year % 100f == 0f && year % 400f != 0f) {
                System.out.println("El año no es bisiesto");
            } else {
                System.out.println("El año es bisiesto");
            }
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
