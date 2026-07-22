package CodeSolving_DSA.LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree_InorderTraversal_94 {
    public List<Integer> inorderTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        inorder(root, result);
        return result;
    }

     private void inorder(Node root, List<Integer>result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.data);
        inorder(root.right, result);
     }

    public static void main(String[] args) {
        BinaryTree_InorderTraversal_94 cons = new BinaryTree_InorderTraversal_94();

        Node root = new Node(10);

        root.left = new Node(9);
        root.right = new Node(8);

        root.left.left = new Node(11);

        List<Integer> ans = cons.inorderTraversal(root);
        System.out.println(ans);
    }
}
