package Class10.PersonWithContructor;

public class Person {
    String fn;
    String ln;
    char sex;
    int dobDay, dobMonth, dobYear;

    public Person() {
    }

    public Person(String pfn, String ln, char sex, int dobDay, int dobMonth, int dobYear) {
        this.fn = pfn;
        this.ln = ln;
        this.sex = sex;
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
    }

    public Person(String pfn, String ln, char sex) {
        this.fn = pfn;
        this.ln = ln;
        this.sex = sex;
        this.dobDay = 1;
        this.dobMonth = 10;
        this.dobYear = 1969;
    }

}
