package Class10.PersonWithContructor;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(); //create a person object
        p.fn = "John"; //the person object's first name is set
        p.ln = "Doe";
        p.sex = 'm';
        p.dobDay = 1;
        p.dobMonth = 1;
        p.dobYear = 1970;

        //create another person object
        Person p2 = new Person("Jane", "Doe", 'w', 31, 12, 1972);

        Person p3 = new Person("asdf", "asdfas", 'w');
        System.out.printf("first name of person p: %s\n", p.fn);
        System.out.printf("first name of person p2: %s\n", p2.fn);
    }
}
