package Class1.FormattedOutput;

public class NeighborOfTheBeast {
    public static void main(String[] args) {
        System.out.printf("%s %d %s", "the neighbor of the beast:", 667, "!\n");
        System.out.printf("%s %X %s", "the neighbor of the beast:", 667, "!\n");
        System.out.printf("%s %10d %s", "the neighbor of the beast:", 667, "!\n");
        System.out.printf("%s %-10d %s", "the neighbor of the beast:", 667, "!\n");
        System.out.printf("%s %08d %s", "the neighbor of the beast:", 667, "!\n");
        System.out.printf("%s %-+12d %s", "the neighbor of the beast:", 667, "!\n");
    }
}
