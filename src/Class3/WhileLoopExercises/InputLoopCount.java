package Class3.WhileLoopExercises;

import java.util.Scanner;

public class InputLoopCount {
    public static void main(String[] args) {
        int totalValidInputs = 0;

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        while (grade > 0) {
            totalValidInputs++;
            grade = sc.nextInt();
        }
        // classify grades
        System.out.printf("cnt: %d\nEnd.", totalValidInputs);
        sc.close();
    }
}
