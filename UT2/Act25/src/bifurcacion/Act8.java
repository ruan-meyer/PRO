package bifurcacion;

import java.util.Scanner;

public class Act8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingresa el numero de preguntas");
        int numberQuestions = scanner.nextInt();
        System.out.println("Ingresa el numero de preguntas contestadas correctamente");
        int correctQuestions = scanner.nextInt();
        
        int percentage = (correctQuestions / numberQuestions) * 100;
        
        if(percentage >= 90) {
            System.out.println("Nivel maximo");
        } else if(percentage >= 75) {
            System.out.println("Nivel medio");
        } else if(percentage >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }
    }
}