package Class9.Search;

import java.util.Arrays;

public class BuildInSearch {
    public static void main(String args[]) {
        int[] myarray = {1, 1, 2, 4, 5, 6, 7, 7, 7, 9};
        int valueToFind, positionOfValueToFind;

        /* test with existing value */
        valueToFind = 4;
        positionOfValueToFind = Arrays.binarySearch(myarray, valueToFind);

        if (positionOfValueToFind == -1) {
            System.out.printf("\"Value %d not found\n", valueToFind);
        } else {
            System.out.printf("Value %d found on index position %d\n", valueToFind, positionOfValueToFind);
        }

        /* test with non-existing value */
        valueToFind = 3;
        positionOfValueToFind = Arrays.binarySearch(myarray, valueToFind);

        if (positionOfValueToFind == -1) {
            System.out.printf("Value %d not found\n", valueToFind);
        } else {
            System.out.printf("Value %d found on index position %d\n", valueToFind, positionOfValueToFind);
        }
    }
}

