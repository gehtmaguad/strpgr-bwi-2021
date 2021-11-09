package Class9.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 9, 2, 6, 3, 7, 8, 3, 1};
        /* use sort algorithm */
        bubble(myarray);

        /* print array */
        display(myarray);
    }

    public static void bubble(int numbers[]) {
        boolean swapped;

        /* number of completed runs */
        int i = 0;

        /* this loop is executed as long as there */
        /* was at least one swap operation performed */
        /* at maximum the loop is executed N-1 times */
        do {
            /* no swap operation was performed at the beginning of a run */
            swapped = false;
            /* with each run one more number is fixed and */
            /* has not to be checked in the next run (-i) */
            for (int j = 1; j < numbers.length - i; j++) {
                /* if the left number is bigger then swap */
                if (numbers[j - 1] > numbers[j]) {
                    swap(numbers, j - 1, j);
                    swapped = true;
                }
            }
            i++;
        } while (swapped);
    }

    public static void swap(int arr[], int i, int j) {
        // save the value at position i in tmp variable
        int tmp = arr[i];
        // override the value at position i with the value at position j
        arr[i] = arr[j];
        // override the value at position j with the tmp value
        arr[j] = tmp;
    }

    public static void display(int arr[]) {
        for (int el : arr) {
            System.out.printf("%d ", el);
        }
    }
}
