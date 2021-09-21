package Class3.WhileLoopExercises;

import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        while (grade > 0) {
            grade = sc.nextInt();
        }
        // classify grades
        System.out.printf("End.");
        sc.close();
    }
}
