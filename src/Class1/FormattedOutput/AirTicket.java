package Class1.FormattedOutput;

public class AirTicket {
    public static void main(String[] args) {
        System.out.printf("%S%S%S\n", "Mandl", "Thomas", "MR");
        System.out.printf("%S%S%S\n", "Hinteroberegginger", "Yolanda", "MRS");

        System.out.printf("%.11S%.2S%2.3S\n", "Mandl", "Thomas", "MR");
        System.out.printf("%.11S%.2S%2.3S\n", "Hinteroberegginger", "Yolanda", "MRS");
    }
}
