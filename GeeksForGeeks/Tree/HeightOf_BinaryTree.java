package CodeSolving_DSA.GeeksForGeeks.Tree;

/*Given the root of a binary tree, find the maximum depth of the tree.
* The maximum depth or height of the tree is the number of edges in the tree from the root to the deepest node.*/

public class HeightOf_BinaryTree {
    public static int heightBT(Node root) {

        if (root == null) {
            return -1;
        }

        int leftHeight = heightBT(root.left);
        int rightHeight = heightBT(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(30);

        root.left = new Node(31);
        root.right = new Node(33);

        root.left.left = new Node(35);
        root.left.right = new Node(37);

        root.left.left.left = new Node(2);
        root.left.left.right = new Node(7);

        System.out.println(heightBT(root));
    }
}
