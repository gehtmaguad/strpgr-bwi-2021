package Class12.MiniTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Create a new (empty) linked list here
        LinkedList linkedList = new LinkedList();

        while (true) {
            int value = sc.nextInt();

            //if value is smaller then 0 stop the loop
            if (value < 0) {
                break;
            }

            //if value is 0 or bigger add the value to the front of the list
            addFront(linkedList, value);
        }

        //print the list with the given function
        print(linkedList);
    }

    public static void addFront(LinkedList l, int v) {
        ListNode newNode = new ListNode();
        newNode.data = v;
        newNode.next = l.head;

        l.head = newNode;
    }

    public static void print(LinkedList l) {
        for (ListNode cur = l.head; cur != null; cur = cur.next) {
            System.out.printf("%d ", cur.data);
        }
        System.out.println();
    }
}
