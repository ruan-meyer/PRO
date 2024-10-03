package javaapplication1;

import java.util.Scanner;

public class Act12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the salary:");
        float salary = scanner.nextFloat();

        System.out.println("Enter the years of seniority");
        int seniority = scanner.nextInt();

        if (salary < 500f && seniority >= 10) {
            System.out.println("The employee received a raise of " + (salary*0.2f) + " €");
            salary += (salary*0.2f);
            System.out.println("The employee's new salary is " + salary + " €");
        } else if (salary > 500f && seniority < 10) {
            System.out.println("The employee received a raise of " + (salary*0.05f) + " €");
            salary += (salary*0.05f);
            System.out.println("The employee's new salary is " + salary + " €");
        } else {
            System.out.println("The salary of the employee is " + salary + " €");
        }
    }
}
