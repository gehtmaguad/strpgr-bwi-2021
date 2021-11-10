package Class10.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(); //create a person object
        p.fn = "John"; //the person object's first name is set
        p.ln = "Doe";
        p.sex = 'm';
        p.dobDay = 1;
        p.dobMonth = 1;
        p.dobYear = 1970;

        Person p2 = new Person(); //create another person object
        p2.fn = "Jane"; //the person object's first name is set
        p2.ln = "Doe";
        p2.sex = 'w';
        p2.dobDay = 31;
        p2.dobMonth = 12;
        p2.dobYear = 1972;

        // Classes are reference types
        Person p3 = p;
        p3.sex = 'd';

        // Deleting reference types
        p3 = null;
    }
}
