package bifurcacion;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta el primer numero:");
        int number1 = scanner.nextInt();
        
        System.out.println("Inserta el segundo numero:");
        int number2 = scanner.nextInt();
        
        System.out.println("Inserta el tercer numero:");
        int number3 = scanner.nextInt();
        
        if(number1 > number2 && number1 > number3){
            System.out.println("El mayor numero es " + number1);
        } else if(number2 > number1 && number2 > number3) {
            System.out.println("El mayor numero es " + number2);
        } else if(number3 > number1 && number3 > number2){
            System.out.println("El mayor numero es " + number3);
        } else {
            System.out.println("Error: probablemente hay tres numeros iguales");
        }
    }
}