package Class3.ForLoopExercises;

import java.util.Scanner;

public class Ex3FitzQuack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        for (int n = 1; n <= end; n++) {
            if (n % 5 == 0 && n % 7 == 0) {
                System.out.printf("FitzQuack ");
            } else if (n % 5 == 0) {
                System.out.printf("Fitz ");
            } else if (n % 7 == 0) {
                System.out.printf("Quack ");
            } else {
                System.out.printf("%d ", n);
            }

            if (n % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
}
