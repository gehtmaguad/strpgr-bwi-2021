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

        // Example 2: Technikum Wien
        TechnikumWien tw = new TechnikumWien();
        for (int i = 0; i < tw.courseOfStudies.length; i++) {
            tw.courseOfStudies[i] = new CourseOfStudy();
            tw.courseOfStudies[i].name = "Course #" + i;
            for (int y = 0; y < tw.courseOfStudies[i].students.length; y++) {
                tw.courseOfStudies[i].students[y] = new Person();
            }
        }
    }
}
