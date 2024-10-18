package repeticion.dowhile;

import java.util.Scanner;

public class Act5{
    public static void main(String[] args){
        getNumberBetween(10, 20);
    }
    
    public static int getNumberBetween(int number1, int number2){
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.println("Introduce un numero entre " + number1 + " y " + number2 + ":");
            number = sc.nextInt();
        } while(number < number1 || number > number2);
        return number;
    }
}