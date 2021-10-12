package Class6.Arrays;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        // example 1
        double temp1 = 5.3;
        double temp2 = 7.2;
        double temp3 = 14.1;
        double temp4 = 8.2;
        double average = (temp1 + temp2 + temp3 + temp4) / 4;
        System.out.printf("%.2f\n", temp1);
        System.out.printf("%.2f\n", temp2);
        System.out.printf("%.2f\n", temp3);
        System.out.printf("%.2f\n", temp4);
        System.out.printf("average: %.2f\n", average);

        // example 2
        double[] temperatures2 = {5.3, 7.2, 14.1, 8.2};
        double average2 = (temperatures2[0] + temperatures2[1] + temperatures2[2] + temperatures2[3]) / 4;
        System.out.printf("%.2f\n", temperatures2[0]);
        System.out.printf("%.2f\n", temperatures2[1]);
        System.out.printf("%.2f\n", temperatures2[2]);
        System.out.printf("%.2f\n", temperatures2[3]);
        System.out.printf("average2: %.2f\n", average2);

        // example 3
        double[] temperatures3 = {5.3, 7.2, 14.1, 8.2};
        double average3 = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("loop: %.2f\n", temperatures3[i]);
            average3 += temperatures3[i];
        }
        average3 = average3 / 4;
        System.out.printf("average3: %.2f\n", average3);

        // example 4
        double[] temperatures4 = {5.3, 7.2, 14.1, 8.2};
        double average4 = 0;
        for (int i = 0; i < temperatures4.length; i++) {
            System.out.printf("loop: %.2f\n", temperatures4[i]);
            average4 += temperatures4[i];
        }
        average4 = average4 / temperatures4.length;
        System.out.printf("average4: %.2f\n", average4);
    }
}
