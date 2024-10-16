package bifurcacion;

import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("El numero es positivo");
        } else if (number < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es nulo");
        }
    }
}