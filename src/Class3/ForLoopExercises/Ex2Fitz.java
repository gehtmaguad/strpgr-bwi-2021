package Class3.ForLoopExercises;

import java.util.Scanner;

public class Ex2Fitz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        for (int n = 1; n <= end; n++) {
            if (n % 5 == 0) {
                System.out.printf("Fitz ");
            } else {
                System.out.printf("%d ", n);
            }

            if (n % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
}
