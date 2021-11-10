package Class10.ReferenceTypesAndFunctions;

public class Main {
    public static void main(String[] args) {
        Foo a = new Foo();
        a.f = 0;
        bar(a);
        //a.f is now 1
        System.out.println(a.f);
    }

    public static void bar(Foo p) {
        p.f++;
    }
}
