package CodeSolving_DSA.GeeksForGeeks.Tree;

public class Balance_Tree_Check {
    private int heightOf_BinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightOf_BinaryTree(root.left), heightOf_BinaryTree(root.right));
    }

    /*
    * This is the Naive approach for this problem
    * Using two Pointers
    * The Time Complexity is = O(n2)
    * S.C = O(h)
    * */

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        int lh = heightOf_BinaryTree(root.left);
        int rh = heightOf_BinaryTree(root.right);

        if (Math.abs(lh - rh) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        Balance_Tree_Check cons = new Balance_Tree_Check();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        boolean ans = cons.isBalanced(root);

        System.out.println(ans);
    }
}
