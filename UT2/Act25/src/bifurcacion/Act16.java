package bifurcacion;

import java.util.Scanner;

public class Act16{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el precio de la botella:");
        float price = scanner.nextFloat();
        
        System.out.println("Intruduce el numero de botellas a comprar");
        int amount = scanner.nextInt();
        
        if(price >= 60 && amount >= 20){
            System.out.println("Se aplica un descuento del 25%");
            System.out.println("El precio final se queda en " + 
                ((price * (float) amount) - ((price * (float) amount) * 0.25f)) + 
                "€"
            );
        } else if(amount >= 20) {
            System.out.println("Se aplica un descuento del 20%");
            System.out.println("El precio final se queda en " + 
                ((price * (float) amount) - ((price * (float) amount) * 0.2f)) + 
                "€"
            );
        } else if(price >= 60 && amount < 20){
            System.out.println("Se aplica un descuento del 10%");
            System.out.println("El precio final se queda en " + 
                ((price * (float) amount) - ((price * (float) amount) * 0.1f)) + 
                "€"
            );
        } else {
            System.out.println("No se aplica ningun descuento");
            System.out.println("El precio final se queda en " 
                + (price * (float) amount) + "€");
        }
    }
}