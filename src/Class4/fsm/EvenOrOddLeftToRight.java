package Class4.fsm;

import java.util.Scanner;

public class EvenOrOddLeftToRight {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String state = "q0";

        System.out.printf("enter first digit:");
        byte binary = sc.nextByte();

        while (binary == 0 || binary == 1) {
            if (binary == 0) {
                state = "q0";
            } else {
                state = "q1";
            }
            System.out.printf("current state is: %s (%s) \n",
                    state,
                    state == "q0" ? "even" : "odd"
            );

            System.out.printf("enter next digit:");
            binary = sc.nextByte();
        }

        System.out.printf("last state is: %s (%s) \n",
                state,
                state == "q0" ? "even" : "odd"
        );
    }
}
