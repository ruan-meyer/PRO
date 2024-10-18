package repeticion.dowhile;

import java.util.Scanner;

public class Act1{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int number;
       int result = 0;
       do {
           System.out.println("Introduce un numero positivo:");
           number = sc.nextInt();
           if(number > 0){
               result += number;
           }
       } while(number > 0);
       System.out.println("El resultado final es " + result);
    }
}