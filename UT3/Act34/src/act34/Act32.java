package act34;

import java.util.Scanner;

public class Act32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int aes = 0;
        int ees = 0;
        int ies = 0;
        int oes = 0;
        int ues = 0;
       
        System.out.println("Enter a phrase:");
        String phrase = sc.nextLine();
       
        phrase = phrase.toLowerCase();
        for(int i = 0; i < phrase.length(); i++){
            switch(phrase.charAt(i)){
                case 'a':
                   aes += 1;
                   break;
                case 'e':
                   ees += 1;
                   break;
                case 'i':
                   ies += 1;
                   break;
                case 'o':
                   oes += 1;
                   break;
                case 'u':
                   ues += 1;
                   break;
                default:
                    break;
            }
        }
        
        System.out.println("A: " + aes);
        System.out.println("E: " + ees);
        System.out.println("I: " + ies);
        System.out.println("O: " + oes);
        System.out.println("U: " + ues);
    }
}
