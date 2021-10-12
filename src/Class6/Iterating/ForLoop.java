package Class6.Iterating;

public class ForLoop {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};

        //from left to right
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%2d", a[i]);
        }

        System.out.println();

        //from right to left
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.printf("%2d", a[i]);
        }
    }
}
