package Class7.SlideExamples;

public class AverageCalc {
    public static void main(String[] args) {
        double[] myArray = {23, -3, 5, 7, 46, 11};
        display(myArray);
        display(average3(myArray));
    }

    public static void display(double[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("%6.1f", a[i]);
        System.out.println();
    }

    public static double[] average3(double[] a) {
        if (a.length == 0)
            /*empty array*/
            return null;

        double[] b = new double[a.length];
        if (a.length == 1) { /*one element only*/
            b[0] = a[0];
            return b;
        }

        /* special case: begin*/
        b[0] = (a[0] + a[1]) / 2.0;
        for (int i = 1; i < a.length - 1; i++) {
            /* general case*/
            b[i] = (a[i - 1] + a[i] + a[i + 1]) / 3.0;
        }

        /* special case : end*/
        b[a.length - 1] = (a[a.length - 2] + a[a.length - 1]) / 2.0;
        return b;
    }
}
