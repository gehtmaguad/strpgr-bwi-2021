package Class6.SelfChecks;

import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = 0;
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] > a[j]) {
                    b[i]++;
                    cnt++;
                }
            }
        }
        System.out.printf("%d inversions.\n", cnt);

        for (int i = 0; i < N; i++) {
            System.out.printf("%2d ", a[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < N; i++) {
            System.out.printf("%2d ", b[i]);
        }
        
        sc.close();
    }
}
