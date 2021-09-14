package Class2.SelectionStatements;

import java.util.Scanner;

public class NumberEnding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int e = number % 10;
        int d = number / 10 % 10;
        String end = "th";

        if (d != 1) {
            if (e == 1)
                end = "st";
            else if (e == 2)
                end = "nd";
            else if (e == 3)
                end = "rd";
        }

        System.out.printf("%d%s\n", number, end);
        sc.close();
    }
}
