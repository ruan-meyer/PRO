package bifurcacion;

import java.util.Scanner;

public class Act14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta la hora:");
        int hour = scanner.nextInt();
        System.out.println("Inserta el minuto:");
        int minute = scanner.nextInt();
        System.out.println("Inserta el segundo");
        int second = scanner.nextInt();

        if (second >= 30) {
            if (minute == 59){
                System.out.println("Pasado 30 segundos seran las " + (hour+1) + ":" + 0 + ":" + ((second+30)-60));
            } else {
                System.out.println("Pasado 30 segundos seran las " + hour + ":" + (minute+1) + ":" + ((second+30)-60));
            }
        } else {
            System.out.println("Pasado 30 segundos seran las " + hour + ":" + minute + ":" + (second+30));
        }
    }
}
