package Class3.WhileLoopExercises;

import java.util.Scanner;

public class InputLoopMax {
    public static void main(String[] args) {
        int totalValidInputs = 0;
        int sumValidInputs = 0;
        int maxOfValidInputs = 0;

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        while (grade > 0) {
            totalValidInputs++;
            sumValidInputs += grade;
            if (grade > maxOfValidInputs) {
                maxOfValidInputs = grade;
            }
            grade = sc.nextInt();
        }
        // classify grades
        System.out.printf("cnt: %d\nsum: %d\nmax: %d\nEnd.",
                totalValidInputs, sumValidInputs, maxOfValidInputs);
        sc.close();
    }
}
