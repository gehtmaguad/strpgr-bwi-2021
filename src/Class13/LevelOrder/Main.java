package Class13.LevelOrder;

public class Main {
    public static void main(String[] args) {
        BSTNode bst = null;
        bst = insert(bst, 5);
        bst = insert(bst, 14);
        bst = insert(bst, 12);
        bst = insert(bst, 1);
        bst = insert(bst, 6);
        bst = insert(bst, 15);
        bst = insert(bst, 3);

        System.out.print("Levelorder: ");
        levelOrder(bst);
        System.out.println();
    }

    public static BSTNode insert(BSTNode bst, int data) {
        if (bst == null) {
            BSTNode newNode = new BSTNode(); // create the new node
            newNode.data = data;
            return newNode;
        }
        if (data < bst.data)
            bst.left = insert(bst.left, data); // insert left
        else if (data > bst.data)
            bst.right = insert(bst.right, data); // insert right
        else
            System.out.println("Already in tree. ignored.");
        return bst;
    }

    public static void levelOrder(BSTNode bst) {
        Queue q = new Queue();
        enqueue(q, bst); //put root in queue
        // while there are elements in the queue
        while (q.head != null) {
            //remove the first and put children in queue
            BSTNode tmp = dequeue(q);
            if (tmp.left != null)
                enqueue(q, tmp.left);
            if (tmp.right != null)
                enqueue(q, tmp.right);
            //print, aka visit
            System.out.printf("%2d ", tmp.data);
        }
    }

    public static void enqueue(Queue q, BSTNode node) {
        // create node
        QueueNode n = new QueueNode();
        n.data = node;
        if (q.tail == null) {
            q.head = q.tail = n;
            return;
        }
        // append to tail
        q.tail.next = n;
        q.tail = n;
    }

    public static BSTNode dequeue(Queue q) {
        if (q == null || q.head == null)
            return null;
        // unlink former head
        QueueNode tmp = q.head;
        q.head = q.head.next;
        // did we dequeue the last remaining element?
        if (q.head == null)
            q.tail = null;
        return tmp.data;
    }
}
