package CodeSolving_DSA.GeeksForGeeks.Tree;

public class LevelOrder_BFStraversal {

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void printAll(Node root, int noob) {
        if (root == null) {
            return;
        }

        if (noob == 0) {
            System.out.print(root.data + " ");
            return;
        }

        printAll(root.left, noob-1);
        printAll(root.right, noob-1);
    }

    public static void naiveApproach(Node root) {
        int h = getHeight(root);

        for (int i=0; i<h; i++) {
            printAll(root, i);
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        BFS_TraversalLevel_Order cons = new BFS_TraversalLevel_Order();

        Node root = new Node(10);

        root.left = new Node(9);
        root.right = new Node(8);

        root.left.left = new Node(12);
        root.right.right = new Node(7);

        root.left.left.left = new Node(63);
        root.right.right.right = new Node(30);

        naiveApproach(root);
    }
}

