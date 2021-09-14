package Class2.SelectionStatements;

import java.util.Scanner;

public class TimeFormatConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zeit, h24, m;

        System.out.printf("Zeit: ");
        zeit = sc.nextInt();

        /* Zerlegen */
        h24 = zeit / 100;
        m = zeit % 100;

        /* Check */
        if (h24 < 0 || h24 > 23 || m < 0 || m > 59) {
            System.out.printf("Ungueltige Eingabe!\n");
        } else {
            if (zeit < 100) {
                System.out.printf("%02d:%02d AM\n", h24 + 12, m);
            } else if (zeit < 1200) {
                System.out.printf("%02d:%02d AM\n", h24, m);
            } else if (zeit < 1300) {
                System.out.printf("%02d:%02d PM\n", h24, m);
            } else {
                System.out.printf("%02d:%02d PM\n", h24 - 12, m);
            }
        }
        sc.close();
    }
}
