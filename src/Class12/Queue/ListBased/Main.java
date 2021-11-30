package Class12.Queue.ListBased;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        enqueue(q, 5);
        enqueue(q, 8);
        enqueue(q, 13);
        enqueue(q, 2);

        print(q);

        int n;
        while (Integer.MIN_VALUE != (n = dequeue(q)))
            System.out.println(n);
    }

    public static int dequeue(Queue q) {
        if (q.head == null) {//the queue is already empty
            return Integer.MIN_VALUE;//error value
        }
        int m = q.head.item;
        q.head = q.head.next;
        if (q.head == null) { //we removed the last remaining element
            q.tail = null;
        }
        return m;
    }

    public static void enqueue(Queue q, int n) {
        Node nN = new Node(); //create and init new node
        nN.item = n;

        if (q.tail == null) { //enqueueing to empty queue
            q.tail = q.head = nN;
            return;
        }

        //general case
        q.tail.next = nN;
        q.tail = nN;
    }

    public static void print(Queue s) {
        for (Node cur = s.head; cur != null; cur = cur.next) {
            System.out.printf("->%d", cur.item);
        }
        System.out.printf("\n");
    }
}
