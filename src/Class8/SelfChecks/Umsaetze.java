package Class8.SelfChecks;

import java.util.Scanner;

public class Umsaetze {
    public static Scanner sc;

    public static void main(String[] args) {
        app();
    }

    public static void app() {
        sc = new Scanner(System.in);

        System.out.println("Enter Number Of Branches: ");
        int numberOfBranches = sc.nextInt();

        System.out.println("Enter Number Of Days: ");
        int numberOfDays = sc.nextInt();

        int[][] revenues = scanRevenues(numberOfBranches, numberOfDays);
        printRevenues(revenues);
        System.out.println(sumDay(revenues, 2));
        System.out.println(sumBranch(revenues, 2));
    }

    public static int[][] scanRevenues(int branches, int days) {
        int[][] revenues = new int[branches][days];
        for (int i = 0; i < revenues.length; i++) {
            for (int j = 0; j < revenues[i].length; j++) {
                System.out.println("Enter revenue for branch #" + i + " and day #" + j);
                revenues[i][j] = sc.nextInt();
            }
        }
        return revenues;
    }

    public static void printRevenues(int[][] revenues) {
        for (int[] branch : revenues) {
            for (int day : branch) {
                System.out.printf("%3d", day);
            }
            System.out.println();
        }
    }

    public static int sumDay(int[][] revenues, int day) {
        int sumDay = 0;
        for (int i = 0; i < revenues.length; i++) {
            sumDay += revenues[i][day - 1];
        }
        return sumDay;
    }

    public static int sumBranch(int[][] revenues, int branch) {
        int sumBraches = 0;
        int[] days = revenues[branch - 1];
        for (int day : days) {
            sumBraches += day;
        }
        return sumBraches;
    }
}
