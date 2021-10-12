package Class6.Arrays;

import java.util.Scanner;

public class Read10Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mean = 0;
        int[] v = new int[10]; //declare an array for 10 int values

        //fill the array with user input values
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number please (" + (i + 1) + "/10)");
            v[i] = sc.nextInt(); //assign a value to the i-th position in the array v
        }
        for (int i = 0; i < 10; i++) {
            // get the value at the i-th position
            // of the array v and add it to mean
            mean += v[i];
        }
        mean /= 10.0;
        System.out.println("mean= " + mean);
        sc.close();
    }
}
