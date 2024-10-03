package javaapplication1;

import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the total number of questions:");
        float totalQuestions = scanner.nextFloat();

        System.out.println("Insert the number of questions answered correctly");
        float correctQuestions = scanner.nextFloat();

        float percentagePerQuestion = 100f / totalQuestions;
        float percentageDegree = percentagePerQuestion * correctQuestions;

        if (percentageDegree >= 90f) {
            System.out.println("The candidate obtained the maximum level");
        } else if (percentageDegree >= 75f) {
            System.out.println("The candidate obtained a medium level");
        } else if (percentageDegree >= 50f) {
            System.out.println("The candidate obtained a regular level");
        } else if (percentageDegree < 50f) {
            System.out.println("The candidate is under the minimum level");
        }
    }
}
