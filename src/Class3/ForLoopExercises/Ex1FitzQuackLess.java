package Class3.ForLoopExercises;

import java.util.Scanner;

public class Ex1FitzQuackLess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = scanner.nextInt();
        for (int n = 1; n <= end; n++) {
            System.out.printf("%2d ", n);
            if (n % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
}
