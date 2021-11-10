package Class10.Equality;

public class Main {
    public static void main(String[] agrs) {
        Foo a = new Foo();
        a.f = 0;

        Foo b = new Foo();
        b.f = 1;

        Foo c = new Foo();
        c.f = 1;

        Foo d = a;

        System.out.printf("a == b is %b\n", a == b); //F
        System.out.printf("a == c is %b\n", a == c); //F
        System.out.printf("a == d is %b\n", a == d); //T
        System.out.printf("b == c is %b\n", b == c); //F
        System.out.printf("b == d is %b\n", b == d); //F
        System.out.printf("c == d is %b\n", c == d); //F
        System.out.printf("d == d is %b\n", d == d); //T
    }
}
