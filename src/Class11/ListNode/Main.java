package Class11.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode head = null; //empty list
        //add a few numbers
        head = addFront(head, 5);
        head = addFront(head, -4);
        head = addFront(head, 17);
        head = addFront(head, 5);
        head = addFront(head, 12);
        head = addFront(head, 5);

        System.out.println(size(head));
        print(head);

        // head = filter(head, 5);
        // head = reverse(head);
        // int result = indexOf(head, 12);
        // result = indexOf(head, 99);
        // head = removePos(head,3);
        // head = sort(head);
    }

    public static ListNode addFront(ListNode head, int data) {
        ListNode newNode = new ListNode(); // create new node
        newNode.data = data; // store data in node
        newNode.next = head; // establish link
        return newNode;
    }

    public static void print(ListNode head) {
        for (ListNode cur = head; cur != null; cur = cur.next) {
            System.out.printf("->%d", cur.data);
        }
    }

    public static int size(ListNode head) {
        int counter = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            counter++;
        }

        return counter;
    }

    public static ListNode removeFront(ListNode head) {
        if (head == null)
            return null;
        ListNode tmp = head.next;
        head.next = null; // unlink
        return tmp;
    }

    public static ListNode addBack(ListNode head, int data) {
        ListNode newNode = new ListNode();
        newNode.data = data;
        newNode.next = null;
        if (head == null) // adding to empty list
            return newNode;
        ListNode cur;
        for (cur = head; cur.next != null; cur = cur.next)
            ;
        cur.next = newNode;
        return head;
    }

    public static ListNode removeBack(ListNode head) {
        if (head == null)
            return null; // removing from empty list
        if (head.next == null)
            return null; // removing only element in list
        ListNode cur;
        for (cur = head; cur.next.next != null; cur = cur.next)
            ;
        cur.next = null;
        return head;
    }

    public static int get(ListNode list, int pos) {
        int cnt = 0;
        for (ListNode cur = list; cur != null; cur = cur.next)
            if (cnt++ == pos)
                return cur.data;
        System.err.printf("no such element (%d)\n", pos);
        return Integer.MIN_VALUE;
    }

    public static ListNode insert(ListNode list, int v, int pos) {
        if (pos <= 0)
            return addFront(list, v);
        int cnt = 0;
        for (ListNode cur = list; cur != null; cur = cur.next) {
            if (cnt++ == pos - 1 || cur.next == null) {
                cur.next = addFront(cur.next, v);
                return list;
            }
        }
        return list;
    }

    public static ListNode filter(ListNode list, int v) {
        ListNode newNode = null;
        for (ListNode cur = list; cur != null; cur = cur.next) {
            if (cur.data == v) {
                newNode = addBack(newNode, v);
            }
        }

        return newNode;
    }

    public static ListNode reverse(ListNode list) {
        ListNode newNode = null;
        newNode = addFront(newNode, 5);
        for (ListNode cur = list; cur != null; cur = cur.next) {
            newNode = addFront(newNode, cur.data);
        }

        return newNode;
    }

    public static int indexOf(ListNode list, int v) {
        int cnt = 0;
        for (ListNode cur = list; cur != null; cur = cur.next) {
            if (cur.data == v)
                return cnt;
            cnt++;
        }
        System.err.printf("no such value (%d)\n", v);
        return Integer.MIN_VALUE;
    }

    public static ListNode removePos(ListNode list, int pos) {
        if (pos == 0) {
            list = removeFront(list);
        }

        int cnt = 0;
        ListNode tmp = null;
        for (ListNode cur = list; cur != null; cur = cur.next) {
            if (pos == cnt + 1) {
                tmp = cur;
            }
            if (pos == cnt) {
                tmp.next = cur.next;
                cur.next = null;
            }
            cnt++;
        }

        return list;
    }

    public static ListNode sort(ListNode list) {
        ListNode newNode = null;
        for (ListNode cur = list; cur != null; cur = cur.next) {
            if (newNode == null) {
                newNode = addFront(newNode, cur.data);
                continue;
            }

            int counter = 0;
            for (ListNode newNodeCur = newNode; newNodeCur != null; newNodeCur = newNodeCur.next) {
                if (newNodeCur.data >= cur.data) {
                    newNode = insert(newNode, cur.data, counter);
                    break;
                }
                if (newNodeCur.next == null) {
                    newNode = addBack(newNode, cur.data);
                    break;
                }
                counter++;
            }
        }

        return newNode;
    }
}
