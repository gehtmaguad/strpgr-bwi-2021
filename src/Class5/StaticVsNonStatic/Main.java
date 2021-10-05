package Class5.StaticVsNonStatic;

import static Class5.StaticVsNonStatic.Math.add;

public class Main {
    public static void main(String[] agrs) {
        System.out.printf("Result of class method: %d\n", add(2, 3));

        Math math = new Math();
        System.out.printf("Result of instance method: %d\n", math.subtract(2, 3));
    }
}
