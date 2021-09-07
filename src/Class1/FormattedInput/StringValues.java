package Class1.FormattedInput;

import java.util.Scanner;

public class StringValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        String lastname = sc.next();
        String firstname = sc.next();
        System.out.printf(": ");
        String greeting = sc.next();
        System.out.printf("%s %s %s%n", greeting, firstname, lastname);
        sc.close();
    }
}
