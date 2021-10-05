package Class5.RecursiveFunctions;

public class Countdown {
    public static void main(String[] agrs) {
        countdown(10);
    }

    public static void countdown(int counter) {
        if (counter == 0) {
            System.out.printf("BOOM");
            return;
        }
        System.out.printf("%d\n", counter);
        countdown(counter - 1);
    }
}
