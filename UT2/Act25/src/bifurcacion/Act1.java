package bifurcacion;

import java.util.Scanner;


public class Act1 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entra el primer numero:");
        int number1 = scanner.nextInt();
        
        System.out.println("Entra el segundo numero;");
        int number2 = scanner.nextInt();
        
        if(number1 > number2) {
            System.out.println("La suma de los dos numeros es " + (number1+number2));
            System.out.println("La diferencia de los dos numeros es " + (number1-number2));
        } else if(number1 < number2) {
            System.out.println("El producto de los dos numeros es " + (number1*number2));
            System.out.println("La division  del primer numero respecto al segundo es " + (number1/number2));
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}