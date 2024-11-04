package bifurcacion;

import java.util.Scanner;

public class Act9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta el primer numero");
        int number1 = scanner.nextInt();
        
        System.out.println("Inserta el segundo numero");
        int number2 = scanner.nextInt();
        
        System.out.println("Inserta el producto");
        int product = scanner.nextInt();
        
        if(number1 * number2 == product){
            System.out.println("correcto");
        } else {
            System.out.println("Error");
            System.out.println("El producto de " + number1 + " y " + number2 + 
                                " es " + (number1*number2));
        }
    }
}