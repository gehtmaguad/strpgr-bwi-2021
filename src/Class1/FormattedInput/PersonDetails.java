package Class1.FormattedInput;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf(": ");
        String firstname = sc.next();
        String lastname = sc.next();

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.printf("%s %.7s %02d.%02d.%02d %.1fm %.1fkg%n",
                firstname, lastname, day, month, year, height, weight);

        sc.close();
    }
}
