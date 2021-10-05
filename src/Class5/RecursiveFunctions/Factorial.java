package Class5.RecursiveFunctions;

public class Factorial {
    public static void main(String[] args) {
        int fac_4 = fac(4);
        System.out.println(fac_4);
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}
