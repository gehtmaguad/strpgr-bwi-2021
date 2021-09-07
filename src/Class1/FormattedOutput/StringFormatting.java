package Class1.FormattedOutput;

public class StringFormatting {
    public static void main(String[] args) {
        System.out.printf("|%s|\n", "Freitag");
        System.out.printf("|%10s|\n", "Freitag");
        System.out.printf("|%-10s|\n", "Freitag");
        System.out.printf("|%S|\n", "Freitag");
        System.out.printf("|%2.3S|\n", "Freitag");
    }
}
