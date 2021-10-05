package Class5.Functions;

public class FunctionOverloading {
    public static void main(String[] args) {
        int width = 2;
        int height = 3;
        double width2 = 2.0;
        double height2 = 3.5;
        double radius = 3.0;

        //calls the first function because width and height are int
        double area = calculateArea(width, height);

        //calls the second function because width2 and height2 are double
        area = calculateArea(width2, height2);

        //calls the third function because only one double argument is passed
        area = calculateArea(radius);
    }

    public static double calculateArea(int width, int height) {
        return (double) width * height;
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static double calculateArea(double radius) {
        return 2 * radius * Math.PI;
    }
}
