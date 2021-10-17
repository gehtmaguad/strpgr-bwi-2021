package Class8.SelfChecks;

import java.util.Scanner;

public class NumberPairs {
    static Scanner sc;
    static final int W = 7;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int[] numbers = scan();//assume 0-N
        int[][] hist = new int[W + 1][W + 1];

        for (int i = 0; i < numbers.length - 1; i++)
            hist[numbers[i]][numbers[i + 1]]++;

        for (int i = 0; i < hist.length; i++) {
            for (int j = 0; j < hist[i].length; j++) {
                if (hist[i][j] > 0) System.out.printf("(%d,%d): %d\n", i, j, hist[i][j]);
            }
        }

        sc.close();

    }

    public static int[] scan() {
        System.out.printf(": ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
