package Class1.FormattedInput;

import java.util.Scanner;

public class DateSelfCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int day = date / 1000000;
        int month = date % 1000000 / 10000;
        int year = date % 10000;
        System.out.printf("%02d.%02d.%04d", month, day, year);
        sc.close();
    }
}
