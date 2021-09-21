package Class3.WhileLoopExercises;

import java.util.Scanner;

public class InputLoopMinIdx {
    public static void main(String[] args) {
        int totalValidInputs = 0;
        int sumValidInputs = 0;
        int maxOfValidInputs = 0;
        int minOfValidInputs = Integer.MAX_VALUE;
        int posOfSmallestInput = 0;

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        while (grade > 0) {
            totalValidInputs++;
            sumValidInputs += grade;
            if (grade > maxOfValidInputs) {
                maxOfValidInputs = grade;
            }
            if (grade < minOfValidInputs) {
                minOfValidInputs = grade;
                posOfSmallestInput = totalValidInputs;
            }
            grade = sc.nextInt();
        }
        // classify grades
        System.out.printf("cnt: %d\nsum: %d\nmax: %d\nminIdx: %d\nEnd.",
                totalValidInputs, sumValidInputs, maxOfValidInputs, posOfSmallestInput);
        sc.close();
    }
}
