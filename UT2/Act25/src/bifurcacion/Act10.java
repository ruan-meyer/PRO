package bifurcacion;

import java.util.Scanner;

public class Act10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta el primer numero:");
        int number1 = scanner.nextInt();
        
        System.out.println("Inserta el segundo numero:");
        int number2 = scanner.nextInt();
        
        System.out.println("Inserta el tercer numero:");
        int number3 = scanner.nextInt();
        
        if(number1 == number2 && number1 == number3){
            System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
            System.out.println((number1+number2) + " * " + number3 + " = " + ((number1+number2)*number3));
        } else {
            System.out.println("Hay numeros distintos");
        }
    }
}