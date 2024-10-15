package bifurcacion;

import java.util.Scanner;

public class Act3 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta un numero");
        int number = scanner.nextInt();
        
        if(number < 10 && number > 0) {
            System.out.println("El numero tiene un digito");
        } else if(number >= 10 && number < 100) {
            System.out.println("El numero tiene dos digitos");
        } else {
            System.out.println("Error: el numero debe estar entre 1 y 99");
        }
    }
}