package javaapplication1;

import java.util.Scanner;

public class Act14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the hour");
        int hour = scanner.nextInt();
        System.out.println("Enter the minute");
        int minute = scanner.nextInt();
        System.out.println("Enter the second");
        int second = scanner.nextInt();

        if (second >= 30) {
            if (minute == 59){
                System.out.println("After 30 seconds it will be " + (hour+1) + ":" + 0 + ":" + ((second+30)-60));
            } else {
                System.out.println("After 30 seconds it will be " + hour + ":" + (minute+1) + ":" + ((second+30)-60));
            }
        } else {
            System.out.println("After 30 seconds it will be " + hour + ":" + minute + ":" + (second+30));
        }
    }
}
