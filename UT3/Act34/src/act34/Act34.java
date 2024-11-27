package act34;

import java.util.Scanner;

public class Act34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        
        int[] grades = new int[students];
        for(int i = 0; i < grades.length; i++){
            System.out.print("\nGrade " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        
        int average = 0;
        for(int i = 0; i < grades.length; i++){
            average += grades[i];
        }
        average = average / grades.length;
        System.out.println("The average is " + average);
        
        //////////////////////////
        
        int[] count = {0,0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < grades.length; i++){
            switch(grades[i]){
                case 0:
                    count[0]+=1;
                    break;
                case 1:
                    count[1]+=1;
                    break;
                case 2:
                    count[2]+=1;
                    break;
                case 3:
                    count[3]+=1;
                    break;
                case 4:
                    count[4]+=1;
                    break;
                case 5:
                    count[5]+=1;
                    break;
                case 6:
                    count[6]+=1;
                    break;
                case 7:
                    count[7]+=1;
                    break;
                case 8:
                    count[8]+=1;
                    break;
                case 9:
                    count[9]+=1;
                    break;
                case 10:
                    count[10]+=1;
                    break;
            }
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(i + ":" + "*".repeat(count[i]));
        }
    }
}
