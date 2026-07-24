package CodeSolving_DSA.LeetCode.Tree;

public class Diameter_Of_BT_Optimal {
    int diameter = 0;
    public int diameter(Node root) {
        height(root);

        return diameter;
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Diameter_Of_BT_Optimal cons = new Diameter_Of_BT_Optimal();

        Node root = new Node(5);

        root.left = new Node(6);
        root.right = new Node(4);

        root.left.left = new Node(8);
        root.left.right = new Node(9);

        root.right.left = new Node(2);

        System.out.println(cons.diameter(root));
    }
}