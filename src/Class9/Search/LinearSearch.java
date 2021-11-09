package Class9.Search;

public class LinearSearch {
    public static void main(String args[]) {
        int[] myarray = {1, 1, 2, 4, 5, 6, 7, 7, 7, 9};
        int valueToFind, positionOfValueToFind;

        /* test with existing value */
        valueToFind = 4;
        positionOfValueToFind = linearSearch(myarray, valueToFind);

        if (positionOfValueToFind == -1) {
            System.out.printf("Value %d not found\n", valueToFind);
        } else {
            System.out.printf("Value %d found on index position %d\n", valueToFind, positionOfValueToFind);
        }

        /* test with non-existing value */
        valueToFind = 3;
        positionOfValueToFind = linearSearch(myarray, valueToFind);

        if (positionOfValueToFind == -1) {
            System.out.printf("Value %d not found\n", valueToFind);
        } else {
            System.out.printf("Value %d found on index position %d\n", valueToFind, positionOfValueToFind);
        }
    }

    /* returns position of element in array or -1 if not found */
    public static int linearSearch(int sortedArray[], int x) {
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] == x) {
                return i;
            }
        }

        return -1;
    }
}
