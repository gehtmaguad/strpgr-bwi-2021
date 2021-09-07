package Class1.Calculations;

public class DoubleArithmetic {
    public static void main(String[] args) {
        System.out.printf("%f + %f = %f\n", 19., 4., 19. + 4.);
        System.out.printf("%f - %f = %f\n", 19., 4., 19. - 4.);
        System.out.printf("%f * %f = %f\n", 19., 4., 19. * 4.);
        System.out.printf("%f / %f = %f\n", 19D, 4D, 19D / 4d);

        System.out.printf("%g\n", Double.MAX_VALUE);
        System.out.printf("%g\n", Double.MIN_VALUE);
        System.out.printf("%g\n", Double.MAX_VALUE - 1);
        System.out.printf("%f / %f = %f\n", 19., 0., 19. / 0);
        System.out.printf("%f / %f = %f\n", 0., 0., 0. / 0.);
        System.out.printf("%f\n", Double.NEGATIVE_INFINITY * 42);
        System.out.printf("%f\n", Double.NaN * 42);
        System.out.printf("%f\n", Double.POSITIVE_INFINITY * Double.NaN);
    }
}
