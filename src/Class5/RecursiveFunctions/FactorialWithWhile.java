package Class5.RecursiveFunctions;

public class FactorialWithWhile {
    public static void main(String[] args) {
        int fac_4 = fac(7);
        System.out.println(fac_4);
    }

    public static int fac(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++) {
            result = result * x;
        }
        return result;
    }
}
