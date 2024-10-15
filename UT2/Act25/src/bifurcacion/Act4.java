package bifurcacion;

import java.util.Scanner;

public class Act4 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta la primera nota:");
        int degree1 = scanner.nextInt();
        
        System.out.println("Inserta la primera nota:");
        int degree2 = scanner.nextInt();
        
        System.out.println("Inserta la primera nota:");
        int degree3 = scanner.nextInt();
        
        if(((degree1+degree2+degree3)/3) >= 7 ){
            System.out.println("Promocionado");
        } else if(((degree1+degree2+degree3)/3) >= 4 && ((degree1+degree2+degree3)/3) < 7) {
            System.out.println("Regular");
        } else if(((degree1+degree2+degree3)/3) < 4) {
            System.out.println("Suspenso");
        }
    }
}