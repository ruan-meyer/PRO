package bifurcacion;

import java.util.Scanner;

public class Act11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta el primer numero:");
        int number1 = scanner.nextInt();
        
        System.out.println("Inserta el segundo numero:");
        int number2 = scanner.nextInt();
        
        System.out.println("Inserta el tercer numero:");
        int number3 = scanner.nextInt();
        
        if(number1 < 10 && number2 < 10 && number3 < 10){
            System.out.println("Todos los numeros son menores a diez");
        } else if(number1 < 10 || number2 < 10 || number3 < 10){
            System.out.println("Algun numero es menor que 10");
        } else {
            System.out.println("Ningun numero es menor que 10");
        }
    }
}