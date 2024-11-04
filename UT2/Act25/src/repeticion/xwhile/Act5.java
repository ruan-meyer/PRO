package repeticion.xwhile;

import java.util.Scanner;
import java.util.Random;

public class Act5{
    public static void main(String[] args){
        Random rand = new Random();
        int number = rand.nextInt(10);
        
        Scanner scanner = new Scanner(System.in);
        int answer;
        
        System.out.println("Tienes 3 oportunidades para acertar el numero (0-9)");
        int i = 1;
        while(i <= 3){
            System.out.println("Introduce un numero:");
            answer = scanner.nextInt();
            if(answer == number){
                System.out.println("Has acertado el numero");
                break;
            } else {
                if(answer > number){
                    System.out.println("El numero es menor");
                } else {
                    System.out.println("El numero es mayor");
                }
            }
            if(i == 3){
                System.out.println("Se acabaron tus oportunidades, el numero es "
                    + number
                );
            }
            i++;
        }
    }
}