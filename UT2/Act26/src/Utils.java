import java.util.Scanner;

public class Utils {
    public static String askValues(String text){
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.next();
    }
    
    public static int askValues(String text, int number){
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextInt();
    }
    
    public static float askValues(String text, float number){
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        return sc.nextFloat();
    }
}
