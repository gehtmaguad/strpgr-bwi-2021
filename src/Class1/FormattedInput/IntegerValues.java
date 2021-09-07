package Class1.FormattedInput;

import java.util.Scanner;

public class IntegerValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": "); //prompt for input
        int time = sc.nextInt(); //read an integer value
        System.out.printf("time = %d\n", time); //print it again
        sc.close();
    }
}
