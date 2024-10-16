package bifurcacion;

import java.util.Scanner;

public class Act7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta un numero entero entre 1 y 999");
        int number = scanner.nextInt();
        
        if(number > 0 && number < 10){
            System.out.println("El numero tiene 1 cifra");
        } else if(number >= 10 && number < 100){
            System.out.println("El numero tiene 2 cifras");
        } else if(number >= 100 && number < 100) {
            System.out.println("El numero tiene 3 cifras");
        }
    }
}