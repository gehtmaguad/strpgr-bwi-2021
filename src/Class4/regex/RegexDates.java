package Class4.regex;

import java.util.Scanner;

public class RegexDates {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String dateRegex = "[0-9]{1,2}\\.[0-9]{1,2}\\.[0-9]{1,4}";
        String date = sc.next();
        System.out.printf("\"%s\" matches %s\n",
                date,
                date.matches(dateRegex) ? "" : "NOT");
    }
}
