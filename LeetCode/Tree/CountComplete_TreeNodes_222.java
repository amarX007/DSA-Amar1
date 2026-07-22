package CodeSolving_DSA.LeetCode.Tree;

public class CountComplete_TreeNodes_222 {
    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }

        return countNode(root.left) + countNode(root.right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(11);
        root.right = new Node(13);

        root.left.left = new Node(24);
        root.right.right = new Node(26);

        root.right.right.right = new Node(30);

        System.out.println("Number of complete Nodes are: " + countNode(root));
    }
}
