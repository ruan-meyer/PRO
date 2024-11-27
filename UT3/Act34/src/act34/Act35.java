package act34;

import java.util.Scanner;

public class Act35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = sc.nextLine();
        
        String upper = pascalCase(phrase);
        System.out.println(upper);
    }
    
    public static String pascalCase(String phrase){
        phrase = phrase.toLowerCase();
        char[] phraseChar = phrase.toCharArray();
        
        char last = ' ';
        for(int i = 0; i < phrase.length(); i++){
            if(last == ' '){
                switch(phraseChar[i]){
                    case 'a':
                        phraseChar[i] = 'A';
                        break;
                    case 'b':
                        phraseChar[i] = 'B';
                        break;
                    case 'c':
                        phraseChar[i] = 'C';
                        break;
                    case 'd':
                        phraseChar[i] = 'D';
                        break;
                    case 'e':
                        phraseChar[i] = 'E';
                        break;
                    case 'f':
                        phraseChar[i] = 'F';
                        break;
                    case 'g':
                        phraseChar[i] = 'G';
                        break;
                    case 'h':
                        phraseChar[i] = 'H';
                        break;
                    case 'i':
                        phraseChar[i] = 'I';
                        break;
                    case 'j':
                        phraseChar[i] = 'J';
                        break;
                    case 'k':
                        phraseChar[i] = 'K';
                        break;
                    case 'l':
                        phraseChar[i] = 'L';
                        break;
                    case 'm':
                        phraseChar[i] = 'M';
                        break;
                    case 'n':
                        phraseChar[i] = 'N';
                        break;
                    case 'o':
                        phraseChar[i] = 'O';
                        break;
                    case 'p':
                        phraseChar[i] = 'P';
                        break;
                    case 'q':
                        phraseChar[i] = 'Q';
                        break;
                    case 'r':
                        phraseChar[i] = 'R';
                        break;
                    case 's':
                        phraseChar[i] = 'S';
                        break;
                    case 't':
                        phraseChar[i] = 'T';
                        break;
                    case 'u':
                        phraseChar[i] = 'U';
                        break;
                    case 'v':
                        phraseChar[i] = 'V';
                        break;
                    case 'w':
                        phraseChar[i] = 'W';
                        break;
                    case 'x':
                        phraseChar[i] = 'X';
                        break;
                    case 'y':
                        phraseChar[i] = 'Y';
                        break;
                    case 'z':
                        phraseChar[i] = 'Z';
                        break;
                }
            }
            last = phraseChar[i];
        }
        phrase = "";
        for(int i = 0; i < phraseChar.length; i++){
            phrase = phrase + phraseChar[i];
        }
        return phrase;
    }
}