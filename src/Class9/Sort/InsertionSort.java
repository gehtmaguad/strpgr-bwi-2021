package Class9.Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 9, 2, 6, 3, 7, 8, 3, 1};
        /* use sort algorithm */
        insertion(myarray);

        /* print array */
        display(myarray);
    }

    public static void insertion(int numbers[]) {
        /* i is the first idx of unsorted partition */
        for (int i = 1; i < numbers.length; i++) {
            int j = i;
            /* tmp holds value of next element to insert */
            int tmp = numbers[i];
            /* find correct position for tmp */
            while (j > 0 && tmp < numbers[j - 1]) {
                /* on the way there shift right */
                numbers[j] = numbers[j - 1];
                j--;
            }
            /* write tmp value back to the correct position */
            numbers[j] = tmp;
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

