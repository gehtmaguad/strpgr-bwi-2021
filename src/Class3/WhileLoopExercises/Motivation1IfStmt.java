package Class3.WhileLoopExercises;

import java.util.Scanner;

public class Motivation1IfStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade < 1 || grade > 5) {
            System.out.printf("invalid.\n");
            grade = sc.nextInt();
        }
        // classify grades
        System.out.printf("Thank you.");
        sc.close();
    }
}
