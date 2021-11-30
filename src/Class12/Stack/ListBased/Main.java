package Class12.Stack.ListBased;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        push(s, 5);
        push(s, 8);
        push(s, 13);
        push(s, 2);

        print(s);

        int n;
        while (Integer.MIN_VALUE != (n = pop(s)))
            System.out.println(n);
    }

    public static void push(final Stack s, final int c) {
        final Node nN = new Node(); // create and init new node
        nN.item = c;
        nN.next = s.head; // establish link
        s.head = nN; // update head of stack
    }

    public static int pop(final Stack s) {
        if (s == null || s.head == null) // nonexistent or empty stack
            return -Integer.MIN_VALUE; // means error
        final int c = s.head.item;
        s.head = s.head.next;
        return c;
    }

    public static void print(Stack s) {
        for (Node cur = s.head; cur != null; cur = cur.next) {
            System.out.printf("%d<-", cur.item);
        }
        System.out.printf("\n");
    }
}
