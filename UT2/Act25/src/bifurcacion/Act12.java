package bifurcacion;

import java.util.Scanner;

public class Act12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserta el sueldo del operario:");
        float salary = scanner.nextFloat();
        
        System.out.println("Inserta los años de antiguedad del operario:");
        int seniority = scanner.nextInt();
        
        if(salary < 500f && seniority >= 10){
            System.out.println("El operario recibi un aumento de 20% o " + (salary*0.2f) + "€");
            salary = salary + (salary*0.2f);
            System.out.println("Su nuevo sueldo es de " + salary + "€");
        } else if(salary < 500f && seniority < 10) {
            System.out.println("El operario recibi un aumento de 5% o " + (salary*0.05f) + "€");
            salary = salary + (salary*0.05f);
            System.out.println("Su nuevo sueldo es de " + salary + "€");
        } else if(salary > 500f){
            System.out.println("El operario no recibe ningun aumento");
            System.out.println("Su sueldo de " + salary + "€ se mantiene");
        }
    }
}