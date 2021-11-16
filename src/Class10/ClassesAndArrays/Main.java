package Class10.ClassesAndArrays;

public class Main {
    public static void main(String args[]) {
        // Example 1: person array
        Person[] squad = new Person[11]; //an array for 11 persons (all null)

        for (int i = 0; i < squad.length; i++) {
            squad[i] = new Person(); //fill the array with objects
        }

        //the year in which the 5th person was born
        System.out.print(squad[4].dob.year);
    }
}
