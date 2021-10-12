package Class6.Iterating;

public class Foreach {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};

        // for loop
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%2d", a[i]);
        }

        System.out.println();

        // foreach (introduced with Java 8 in 2014)
        for (int val : a) {
            System.out.printf("%2d", val);
        }
    }
}

