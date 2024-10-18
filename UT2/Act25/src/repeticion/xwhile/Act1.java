package repeticion.xwhile;

import java.util.Scanner;

public class Act1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int password = 0;
        
        while(password != 1111){
            System.out.println("Introduce la contraseña:");
            password = scanner.nextInt();
        }
        System.out.println("Has Introducido la contraseña correctamente");
    }
}
