package Class2.Calculations;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Length of a side: ");
        int length = sc.nextInt();
        sc.close();
        System.out.printf("Surface area: %d\nVolume: %d", 6 * length * length, length * length * length);
    }
}
