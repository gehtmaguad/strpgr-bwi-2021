package Class10.ClassesAsAttributes;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(); //create a person object
        p.fn = "John"; //the person object's first name is set
        p.ln = "Doe";
        p.sex = 'm';
        p.dob = new Date();
        p.dob.day = 1;
        p.dob.month = 1;
        p.dob.year = 1970;

        Person p2 = new Person(); //create another person object
        p2.fn = "Jane"; //the person object's first name is set
        p2.ln = "Doe";
        p2.sex = 'w';
        p2.dob = new Date();
        p2.dob.day = 12;

        // Classes are reference types
        Person p3 = p;
        p3.sex = 'd';

        // Deleting reference types
        p3 = null;
    }
}
