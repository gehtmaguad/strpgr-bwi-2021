package Class7.SelfChecks;

import java.util.Scanner;

public class GetrimmtesMittel {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        double arr[] = new double[10];
        double min, max;
        int n;

        eingabe(arr);
        System.out.printf("Untergrenze: ");
        min = sc.nextDouble();
        System.out.printf("Obergrenze: ");
        max = sc.nextDouble();

        System.out.printf("Mittel ungetrimmt: %.2f\n", sum(arr) / arr.length);
        n = trim(arr, min, max);
        System.out.printf("Mittel getrimmt: %.2f\n", sum(arr) / (arr.length - n));
        sc.close();
    }

    public static int trim(double betraege[], double min, double max) {
        int i, n = 0;

        for (i = 0; i < betraege.length; i++)
            if (betraege[i] < min || betraege[i] > max) {
                betraege[i] = 0;
                n++;
            }

        return n;
    }

    public static void eingabe(double betraege[]) {
        int i = 0;

        for (i = 0; i < betraege.length; i++) {
            System.out.printf("Zahl %d: ", i + 1);
            betraege[i] = sc.nextDouble();
        }
    }

    public static double sum(double betraege[]) {
        double sum = 0;
        int i;

        for (i = 0; i < betraege.length; i++)
            sum += betraege[i];

        return sum;
    }
}
