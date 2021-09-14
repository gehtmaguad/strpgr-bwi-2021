package Class2.SelectionStatements;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("grade: ");
        int grade = sc.nextInt();

        System.out.printf("\n\n\n--------Consecutive IFs---------\n");
        if (grade < 6 && grade > 0) {
            System.out.printf("valid\n");
        } else {
            System.out.printf("invalid\n");
        }
        if (grade == 5) {
            System.out.printf("failed.\n");
        } else {
            System.out.printf("passed.\n");
        }
        System.out.printf("Thank you.");

        System.out.printf("\n\n\n--------Nested Ifs---------\n");

        if (grade < 6 && grade > 0) {
            System.out.printf("valid\n");
            if (grade == 5) {
                System.out.printf("failed.\n");
            } else {
                System.out.printf("passed.\n");
            }
        } else {
            System.out.printf("invalid\n");
        }
        System.out.printf("Thank you.");
        sc.close();

        System.out.printf("\n\n\n--------Multiple Alternatives---------\n");

        if (!(grade < 6 && grade > 0)) {
            System.out.printf("invalid\n");
        } else if (grade == 5) {
            System.out.printf("failed.\n");
        } else if (grade == 4) {
            System.out.printf("close fail.\n");
        } else if (grade == 3) {
            System.out.printf("minimum pass.\n");
        } else if (grade == 2) {
            System.out.printf("very good.\n");
        } else {
            System.out.printf("excellent.\n");
        }

        System.out.printf("\n\n\n--------switch case---------\n");

        switch (grade) {
            case 1:
                System.out.println("Selection 1\n");
                break;
            case 2:
                System.out.println("Selection 2\n");
                break;
            case 3:
                System.out.println("Selection 3\n");
                break;
            default:
                System.out.println("Wrong input.\n");
        } /*End of switch*/
    }

}
