package repeticion.dowhile;

import java.util.Scanner;

public class Act3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String identifier;
        String password;
        do{
            System.out.println("Introduce el identificador:");
            identifier = sc.next();
            System.out.println("Introduce la contreseña:");
            password = sc.next();
        } while(!identifier.equals("Pedro") || !password.equals("Peter"));
        System.out.println("Acceso concedido");
    }
}