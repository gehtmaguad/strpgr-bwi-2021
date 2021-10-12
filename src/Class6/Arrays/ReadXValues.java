package Class6.Arrays;

import java.util.Scanner;

public class ReadXValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mean = 0;

        System.out.println("enter number of values to be entered");
        int nValues = sc.nextInt();
        int[] v = new int[nValues];

        //v.length returns the size of the array
        for (int i = 0; i < v.length; i++) {
            System.out.println("enter a number please (" + (i + 1) + "/" + nValues + ")");
            v[i] = sc.nextInt(); //assign a value to the i-th position in the array v
        }
        for (int i = 0; i < v.length; i++) {
            // get the value at the i-th position
            // of the array v and add it to mean
            mean += v[i];
        }
        mean /= (double) v.length;
        System.out.println("mean= " + mean);
        sc.close();
    }
}
