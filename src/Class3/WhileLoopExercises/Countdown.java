package Class3.WhileLoopExercises;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countdown = sc.nextInt();
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        // classify grades
        System.out.printf("Boom!");
        sc.close();
    }
}
