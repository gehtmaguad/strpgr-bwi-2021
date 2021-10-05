package Class5.Functions;

public class FindMin {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        //values of a and b are passed to findMin
        //after the execution of findMin the value of second is returned
        int min = findMin(a, b);
        // "3" is printed
        System.out.print(min);
    }

    public static int findMin(int first, int second) {
        //first and second receiving copies of a and b
        // in this example first = 5 and second = 3
        if (first < second) {
            return first;
        } else {
            //in this example the second value is returned
            return second;
        }
    }
}
