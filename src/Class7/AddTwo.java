package Class7;

public class AddTwo {
    public static void main(String[] args) {
        int[] myArray = {23, -3, 5, 7, 11};
        addTwo(myArray);
        for (int i = 0; i < myArray.length; i++)
            System.out.printf("%3d", myArray[i]);
    }

    public static void addTwo(int[] parArray) {
        for (int i = 0; i < parArray.length; i++)
            parArray[i] += 2;
    }
}
