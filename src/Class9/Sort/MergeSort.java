package Class9.Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 9, 2, 6, 3, 7, 8, 3, 1};
        /* use sort algorithm */
        mergesort(myarray);

        /* print array */
        display(myarray);
    }

    public static void mergesort(int a[]) {
        /* create an auxilliar array that is used by the merge function */
        int[] aux = new int[a.length];
        /* starts the mergesort by calling the recursive function mSort */
        mSort(a, 0, a.length - 1, aux);
    }

    public static void mSort(int numbers[], int left, int right, int[] aux) {
        /* stops the recursion when portion can't be split further */
        if (right <= left) return;
        /* call mSort recursively with the left and the right split */
        int middle = (right + left) / 2;
        mSort(numbers, left, middle, aux);
        mSort(numbers, middle + 1, right, aux);
        /* merge is first executed for the smallest splits */
        merge(numbers, left, middle, right, aux);
    }

    public static void merge(int numbers[], int left, int middle, int right, int[] aux) {
        /* fill the helper array with the numbers between left and right */
        for (int i = left; i <= right; i++)
            aux[i] = numbers[i];

        /* the l counter starts at the left position and goes till the middle */
        int l = left;
        /* the r counter starts at the position middle+1 and goes till right position*/
        int r = middle + 1;
        /* sorts the elements in the numbers array */
        for (int i = left; i <= right; i++) {
            /* if the left element is smaller take it otherwise take */
            /* the right one and increase the respective counter */
            if (r > right || (l <= middle && aux[l] < aux[r]))
                numbers[i] = aux[l++];
            else
                numbers[i] = aux[r++];
        }
    }

    public static void display(int arr[]) {
        for (int el : arr) {
            System.out.printf("%d ", el);
        }
    }
}
