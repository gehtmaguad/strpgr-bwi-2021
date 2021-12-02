package Class13.BST;

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

        System.out.printf("Found: %d\n", searchBST(bst, 12).data);
        System.out.printf("Found: %d\n", searchBST(bst, 3).data);

        System.out.printf("Height: %d\n", height(bst));

        System.out.print("Preorder: ");
        preorder(bst);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(bst);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(bst);
        System.out.println();

        System.out.printf("Count: %d\n", countNodesPreorder(bst));
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

    public static BSTNode searchBST(BSTNode bst, int key) {
        if (bst == null)
            return null;
        if (bst.data == key)
            return bst;
        if (key < bst.data)
            return searchBST(bst.left, key);
        return searchBST(bst.right, key);
    }

    public static int height(BSTNode bst) {
        if (bst == null)
            return 0;
        return Math.max(height(bst.left), height(bst.right)) + 1;
    }

    public static void preorder(BSTNode bst) {
        if (bst == null)
            return;
        System.out.printf("%2d ", bst.data);
        preorder(bst.left);
        preorder(bst.right);
    }

    public static void postorder(BSTNode bst) {
        if (bst == null)
            return;
        postorder(bst.left);
        postorder(bst.right);
        System.out.printf("%2d ", bst.data);
    }

    public static void inorder(BSTNode bst) {
        if (bst == null)
            return;
        inorder(bst.left);
        System.out.printf("%2d ", bst.data);
        inorder(bst.right);
    }

    public static int countNodesPreorder(BSTNode bst) {
        if (bst == null)
            return 0;
        int result = 1 + countNodesPreorder(bst.left) + countNodesPreorder(bst.right);
        return result;
    }
}