package repeticion.xwhile;

import java.util.Scanner;

public class Act4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo:");
        int number = scanner.nextInt();
        
        System.out.println("El numero tiene " + digit(number) + " cifras");
    }
    
    public static int digit(int number){
        int i = 0;
        
        while(number > 0){
            number /= 10;
            i++;
        }
        return i;
    }
}
