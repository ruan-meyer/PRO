package javaapplication1.Act16;

import java.util.Scanner;
import java.util.ArrayList;

public class Act16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task;
        float finalPrice = 0f;

        ArrayList<Bottle> cart = new ArrayList<>();
        do {
            do {
                System.out.println("Press 1 for wine, press 2 for licor, press 3 for stop");
                task = scanner.nextInt();
            } while (task != 1 && task != 2 && task != 3);
            if (task == 1) {
                System.out.println("Enter the price:");
                float price = scanner.nextFloat();
                cart.add(new Bottle("Wine", price));
            } else if (task == 2) {
                System.out.println("Enter the price:");
                float price = scanner.nextFloat();
                cart.add(new Bottle("Licor", price));
            }
        } while (task != 3);

        if (cart.size() >= 20) {
            Boolean allOver60 = true;
            for (int i = 0; i < cart.size(); i++) {
                if (cart.get(i).price < 60f) {
                    allOver60 = false;
                }
            }
            if (allOver60) {
                for (int i = 0; i < cart.size(); i++) {
                    finalPrice += (cart.get(i).price * 0.75f);
                }
            } else {
                for (int i = 0; i < cart.size(); i++) {
                    finalPrice += (cart.get(i).price * 0.90f);
                }
            }
        } else {
            for (int i = 0; i < cart.size(); i++) {
                if (cart.get(i).equals("Wine") && cart.get(i).price >= 60f) {
                    finalPrice += (cart.get(i).price * 0.90f);
                } else {
                    finalPrice += cart.get(i).price;
                }
            }
        }
        System.out.println("The price to pay is " + finalPrice + " €");
    }
}
