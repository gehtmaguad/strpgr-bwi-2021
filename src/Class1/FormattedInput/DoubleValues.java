package Class1.FormattedInput;

import java.util.Scanner;

public class DoubleValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        double temperature = sc.nextDouble();
        System.out.printf("temperature = %.1f%n", temperature); //print it again
        sc.close();
    }
}
