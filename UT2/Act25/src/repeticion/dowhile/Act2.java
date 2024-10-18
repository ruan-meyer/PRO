package repeticion.dowhile;

import java.util.Scanner;

public class Act2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int identifier;
        int password;
        do{
            System.out.println("Introduce el identificador:");
            identifier = sc.nextInt();
            System.out.println("Introduce la contreseña:");
            password = sc.nextInt();
        } while(identifier != 1234 || password != 1111);
        System.out.println("Acceso concedido");
    }
}