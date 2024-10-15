package bifurcacion;

import java.util.Scanner;

public class Act2 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entra la primera nota:");
        int degree1 = scanner.nextInt();
        System.out.println("Entra la segunda nota:");
        int degree2 = scanner.nextInt();
        System.out.println("Entra la tercera nota:");
        int degree3 = scanner.nextInt();
        
        if( ((degree1+degree2+degree3)/3) >= 7 ){
            System.out.println("Promocionado");
        }
    }
}