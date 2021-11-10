package Class11.ListNodeWithAdditionalClass;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(); // an empty list
        addFront(list, 23);
        addFront(list, 44);
        addBack(list, 42);
    }

    public static boolean addFront(MyLinkedList list, int v) {
        ListNode nN = new ListNode();
        nN.data = v;
        if (list.head == null) {
            list.head = list.tail = nN;
            return true;
        }
        nN.next = list.head;
        list.head = nN;
        return true;
    }

    public static boolean addBack(MyLinkedList list, int v) {
        ListNode nN = new ListNode();
        nN.data = v;
        if (list.head == null) {
            list.head = list.tail = nN;
            return true;
        }
        list.tail.next = nN;
        list.tail = nN;
        return true;
    }
}
