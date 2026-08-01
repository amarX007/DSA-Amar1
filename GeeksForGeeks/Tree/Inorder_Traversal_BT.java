package CodeSolving_DSA.GeeksForGeeks.Tree;

import java.util.ArrayList;

/* Recursive Approach */
public class Inorder_Traversal_BT {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, result);

        return result;
    }

    public void helper(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }

        helper(root.left, ans);
        ans.add(root.data);
        helper(root.right, ans);
    }

    public static void main(String[] args) {
        Inorder_Traversal_BT cons = new Inorder_Traversal_BT();

        /*Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);*/

        Node root = new Node(8);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.right = new Node(7);
        root.left.right.right = new Node(10);
        root.right.left = new Node(10);
        root.right.left.left = new Node(6);
        root.right.right = new Node(6);

        System.out.println(cons.inOrder(root));
    }
}
