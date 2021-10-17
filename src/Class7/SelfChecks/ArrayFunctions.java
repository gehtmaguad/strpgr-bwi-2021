package Class7.SelfChecks;

import java.util.Scanner;

public class ArrayFunctions {
    private static Scanner sc;

    private static final int LINEAR_FILL = 1;
    private static final int CONTAINS = 2;
    private static final int COUNT_BELOW = 3;
    private static final int FIND_1 = 4;
    private static final int FIND_2 = 5;
    private static final int FILTER = 6;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        go();
        sc.close();
    }

    public static void go() {
        double[] dArr = {1, 4, 23.3, 12.3, 0.5, 432.53, -123.34, 34.12};
        int[][] iArr2 = {{0}, {10, 11}, {20, 21, 22},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {5, 8, 58, 85, 5, 8, 8, 5, 8, 5}, {900, 800, 700, 600, 500, 400, 300, 200, 100}};
        String[] strings = null;

        System.out.println("choose method to test \n(LINEAR_FILL = 1, "
                + "CONTAINS = 2, 	COUNT_BELOW = 3, "
                + "FIND_1 = 4, FIND_2 = 5, FILTER = 6)");

        while (true) {

            System.out.println(":");
            int choice = sc.nextInt();
            int n;
            switch (choice) {
                case LINEAR_FILL:
                    System.out.println("LinearFill");
                    System.out.println("enter array length, start value and inc value:");
                    linearFill(dArr = new double[sc.nextInt()],
                            sc.nextDouble(), sc.nextDouble());
                    display(dArr);
                    continue;

                case CONTAINS:
                    System.out.println("enter value to look for:");
                    System.out.println("contains: "
                            + contains(iArr2, n = sc.nextInt())
                            + " (" + n + ")");
                    continue;

                case COUNT_BELOW:
                    System.out.println("CountBelow");
                    System.out.println("enter boundary:");
                    System.out.printf("%d",
                            countBelow(dArr, sc.nextDouble()));

                    continue;

                case FIND_1:
                    System.out.println("enter value to find:");
                    System.out.println("find 1: "
                            + find(iArr2[3], n = sc.nextInt())
                            + " (" + n + ")");
                    continue;

                case FIND_2:
                    System.out.println("enter value to find and starting index:");
                    System.out.println("find 2: "
                            + find(iArr2[4], n = sc.nextInt(),
                            sc.nextInt()) + " (" + n + ")");
                    continue;

                case FILTER:
                    System.out.println("enter size of String array, and strings for each position:");
                    System.out.println("Filter");
                    strings = new String[sc.nextInt()];
                    for (int i = 0; i < strings.length; i++) {
                        String it;
                        System.out.print(": ");
                        while ((it = sc.nextLine()).equals(""))
                            ;
                        strings[i] = it;
                    }
                    System.out.print("enter regex: ");
                    String regex;
                    while ((regex = sc.nextLine()).equals(""))
                        ;
                    display(strings);
                    display(filter(strings, regex));

                    continue;

            }
            break;
        }

    }


    public static void display(double[] d) {
        System.out.print("[");
        for (double i : d)
            System.out.printf("%.2f ", i);
        System.out.println("]");
    }

    public static void display(int[] d) {
        System.out.print("[");
        for (int i : d)
            System.out.printf("%3d ", i);
        System.out.println("]");
    }

    public static void display(String[] d) {
        System.out.println("[");
        for (String s : d)
            System.out.printf("%s ", s);
        System.out.println("]");

    }

    public static void linearFill(double[] arr, double start, double inc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start += inc;
        }
    }

    public static boolean contains(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == key)
                    return true;
        return false;
    }

    public static int countBelow(double[] arr, double a) {
        int n = 0;
        for (double e : arr)
            if (e < a)
                n++;
        return n;
    }

    public static int find(int[] arr, int key) {
        return find(arr, key, 0);
    }

    public static int find(int[] arr, int key, int fi) {
        for (int i = (fi >= 0) ? fi : 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    public static String[] filter(String[] arr, String regex) {
        int cnt = 0;
        for (String s : arr)
            if (s.matches(regex))
                cnt++;

        String[] res = new String[cnt];
        int j = 0;
        for (String s : arr)
            if (s.matches(regex)) res[j++] = s;
        return res;
    }




	/*public static void sort(Event[] arr, int ordering){
		for(int i=0;i<arr.length-1; i++){
			for (int j=1; j<arr.length-i; j++)
				if(EventFunctions.compare(arr[j-1], arr[j], ordering)>0){
					Event tmp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;
				}
			}
	}*/


    public static void sort(int[] numbers) {
        int i;
        /* move smallest to first position */
        for (i = numbers.length - 1; i > 0; i--)
            if (numbers[i - 1] > numbers[i])
                swap(numbers, i - 1, i);

        /* i is the first idx of unsorted partition */
        for (i = 1; i < numbers.length; i++) {
            int j = i;
            /* tmp holds value of next element to insert */
            int tmp = numbers[i];
            /* find correct position for tmp */
            while (tmp < numbers[j - 1]) {
                /* on the way there shift right */
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = tmp;
        }
    }

    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
