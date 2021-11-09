package Class9.Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 9, 2, 6, 3, 7, 8, 3, 1};
        /* use sort algorithm */
        selection(myarray);

        /* print array */
        display(myarray);
    }

    public static void selection(int numbers[]) {
        int i, j;
        for (i = 0; i < numbers.length - 1; i++) {
            int min_idx = i;
            /* find idx of minimum of unsorted partition */
            for (j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;
            }
            /* swap minimum to correct position */
            swap(numbers, i, min_idx);
        }
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
