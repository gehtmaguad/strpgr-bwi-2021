package Class9.Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 9, 6, 4, 5, 10};
        /* use sort algorithm */
        quicksort(myarray);

        /* print array */
        display(myarray);
    }

    public static void quicksort(int numbers[]) {
        /* starts the quicksort algorithm */
        quicksort(numbers, 0, numbers.length - 1);
    }

    public static void quicksort(int numbers[], int left, int right) {
        if (right <= left)
            return;

        /* partition returns the new position of the pivot element */
        int i = partition(numbers, left, right);

        /* quicksort is then executed again for the left part ... */
        quicksort(numbers, left, i - 1);

        /* ... and for the right part */
        quicksort(numbers, i + 1, right);
    }

    public static int partition(int numbers[], int left, int right) {
        /* the right element is selected as pivot */
        int pivot = numbers[right];
        int i = left;
        int j = right - 1;

        while (true) {
            /* search for the first element bigger then pivot from the left */
            while (numbers[i] < pivot) {
                i++;
            }

            /* search for the first element smaller then pivot from the right */
            while (pivot < numbers[j]) {
                /* if j == left the pivot positon is found */
                if (j == left)
                    break;
                j--;
            }

            /* pivot positon is found and the loop is stopped */
            if (i >= j) {
                break;
            }

            /* swap the bigger element on the left side with */
            /* the smaller element on the right side */
            swap(numbers, i, j);
        }

        /* swap the pivot element */
        swap(numbers, i, right);

        /* return the new position of the pivot element */
        return i;
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
