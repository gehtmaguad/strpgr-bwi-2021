package Class5.Functions;

public class PowerFunction {
    public static void main(String[] args) {
        int number = 2;
        int n = 4;
        int p = power(number, n);
        System.out.printf("%d^%d=%d", number, n, p);
    }

    // number and n in power() are initialized
    // with copies of the passed arguments
    public static int power(int number, int n) {
        int p = 1;
        while (n > 0) {
            p = p * number;
            // n changes in this function but the original value
            // in the main function remains unchanged
            n--;
        }
        return p;
    }
}
