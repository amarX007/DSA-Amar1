package CodeSolving_DSA.GeeksForGeeks.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Left_ViewOf_a_BinaryTree {
    public static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }


        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();

            for (int i=0; i<queueSize; i++) {
                Node currNode = queue.poll();

                if (i == 0) {
                    result.add(currNode.data);
                }

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Tree:
        //          1
        //        /   \
        //       2     3
        //      / \
        //     4   5

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = leftView(root);

        System.out.println(result);

    }
}
