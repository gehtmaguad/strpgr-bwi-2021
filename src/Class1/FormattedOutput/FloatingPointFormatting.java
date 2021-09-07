package Class1.FormattedOutput;

public class FloatingPointFormatting {
    public static void main(String[] args) {
        System.out.printf("(19.2°C)\n");
        System.out.printf("(%f°C)\n", 19.2);
        System.out.printf("(%.2f°C)\n", 19.2);
        System.out.printf("(%10.2f°C)\n", 19.2);
        System.out.printf("(%+010.2f°C)\n", 19.2);
    }
}
