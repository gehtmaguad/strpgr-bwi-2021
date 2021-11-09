package Class9.Search;

public class BinarySearch {
    public static void main(String args[]) {
        int[] myarray = {1, 1, 2, 4, 5, 6, 7, 7, 7, 9};
        int valueToFind, positionOfValueToFind;

        /* test with existing value */
        valueToFind = 4;
        positionOfValueToFind = binarySearch(myarray, valueToFind);

        if (positionOfValueToFind == -1) {
            System.out.printf("Value %d not found\n", valueToFind);
        } else {
            System.out.printf("Value %d found on index position %d\n", valueToFind, positionOfValueToFind);
        }

        /* test with non-existing value */
        valueToFind = 3;
        positionOfValueToFind = binarySearch(myarray, valueToFind);

        if (positionOfValueToFind == -1) {
            System.out.printf("Value %d not found\n", valueToFind);
        } else {
            System.out.printf("Value %d found on index position %d\n", valueToFind, positionOfValueToFind);
        }
    }

    /* returns position of element in array or -1 if not found */
    public static int binarySearch(int sortedArray[], int x) {
        int l = 0;
        int r = sortedArray.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            System.out.printf("m is %d\n", m);

            // Check if value x is found at position m
            if (sortedArray[m] == x) {
                return m;
            }

            if (sortedArray[m] < x) { // If x is greater, ignore left half
                l = m + 1;
                System.out.printf("l is %d\n", l);
            } else { // If x is smaller, ignore right half
                r = m - 1;
                System.out.printf("r is %d\n", r);
            }

            System.out.printf("\n");
        }

        // if the value x is not in the array we end up here
        return -1;
    }
}
