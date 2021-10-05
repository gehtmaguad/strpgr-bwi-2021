package Class5.RecursiveFunctions;

public class ThereAndBackAgain {

    public static void main(String[] agrs) {
        thereAndBackAgain(10);
    }

    public static void thereAndBackAgain(int counter) {
        if (counter == 0) {
            System.out.printf("%d\n", counter);
            return;
        }
        System.out.printf("downwards: %d\n", counter);
        thereAndBackAgain(counter - 1);
        System.out.printf("upwards: %d\n", counter);
    }
}
