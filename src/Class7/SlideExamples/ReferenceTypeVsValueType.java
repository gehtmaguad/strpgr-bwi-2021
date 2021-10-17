package Class7.SlideExamples;

public class ReferenceTypeVsValueType {
    public static void main(String[] args) {
        int myInt = 3;
        int[] myArray = {1, 2, 3, 4, 5};

        System.out.printf("Value of myInt before function call: %d\n", myInt);
        System.out.printf("Value of third element in myArray before function call: %d\n", myArray[2]);

        addTwo(myInt, myArray);

        System.out.printf("Value of myInt after function call: %d\n", myInt);
        System.out.printf("Value of third element in myArray after function call: %d\n", myArray[2]);
    }

    /* var valueType is initialized with the value of myInt which is a int value (in this case the value 3) */
    /* var referenceType is initialized with the value of myArray which is a reference to the array {1, 2, 3, 4, 5} */
    public static void addTwo(int valueType, int[] referenceType) {
        /* add 2 to variable of primitive data type */
        valueType += 2;

        /* add 2 to each element in the array */
        for (int i = 0; i < referenceType.length; i++)
            referenceType[i] += 2;
    }
}
