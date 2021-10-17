package Class8.SlideExamples;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] table = new int[5][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        display(table);
    }

    private static void display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
