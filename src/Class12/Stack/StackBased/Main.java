package Class12.Stack.StackBased;

public class Main {
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack();
        push(s, 5);
        push(s, 8);
        push(s, 13);
        push(s, 2);

        print(s);
        System.out.println(pop(s));

        int n;
        while (Integer.MIN_VALUE != (n = pop(s)))
            System.out.println(n);
    }

    public static void push(ArrayStack s, int data) {
        if (s.top == s.data.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        s.data[++s.top] = data;
    }

    public static int pop(ArrayStack s) {
        if (s.top <= -1) {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        return s.data[s.top--];
    }

    public static void print(ArrayStack s) {
        for (int i = 0; i <= s.top; i++) {
            System.out.printf("->%d", s.data[i]);
        }
        System.out.printf("\n");
    }
}
