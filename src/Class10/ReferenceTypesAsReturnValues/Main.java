package Class10.ReferenceTypesAsReturnValues;

public class Main {
    public static void main(String[] args) {
        Foo m = spam();
    }

    public static Foo spam() {
        Foo n = new Foo();
        n.f = 42;
        return n;
    }
}
