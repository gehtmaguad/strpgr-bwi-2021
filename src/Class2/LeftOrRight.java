package Class2;

import java.util.Scanner;

public class LeftOrRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ticketNumber = sc.nextLong();
        if (ticketNumber % 2 == 0) {
            System.out.print("LINKS");
        } else {
            System.out.print("RECHTS");
        }
        sc.close();
    }
}
