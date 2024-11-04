package repeticion.xwhile;

import java.util.Scanner;

public class Act2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        int number1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        int number2 = scanner.nextInt();
        
        while(number1 <= number2){
            System.out.println(number1);
            number1++;
        }
    }
}