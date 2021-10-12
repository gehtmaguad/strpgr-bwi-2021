package Class6.SelfChecks;

import java.util.Scanner;

public class ReadArrayPartial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int i, cnt = 0;

        for (i = 0; i < a.length; ) {
            System.out.printf("%d. number: ", i + 1);
            a[i] = sc.nextInt();
            if (a[i] == 0) {
                break;
            }
            if (a[i] <= 0) {
                System.out.printf("invalid input!\n");
            } else
                i++;
        }

        System.out.printf("%d number(s) entered.\n", i);
        if (i == 0) {
            sc.close();
            return;
        }
        cnt = i;
        for (i = 0; i < cnt; i++) {
            System.out.printf("[%d]: %d\n", i, a[i]);
        }
        System.out.printf("Output finished.");
        sc.close();
    }
}
