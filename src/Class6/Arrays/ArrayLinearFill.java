package Class6.Arrays;

import java.util.Scanner;

public class ArrayLinearFill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] sequence;

        System.out.printf(": ");
        int start = sc.nextInt();
        System.out.printf(": ");
        int inkrement = sc.nextInt();
        System.out.printf(": ");
        int len = sc.nextInt();

        sequence = new int[len];
        for (int j = 0; j < sequence.length; j++) {
            sequence[j] = start;
            start += inkrement;
        }

        print(sequence);
        sc.close();
    }

    public static void print(int[] a) {
        for (int n : a)
            System.out.printf("%d ", n);
    }
}
