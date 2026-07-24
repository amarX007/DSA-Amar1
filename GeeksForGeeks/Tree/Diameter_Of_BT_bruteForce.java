package CodeSolving_DSA.GeeksForGeeks.Tree;

public class Diameter_Of_BT_bruteForce {
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int curr = (leftHeight + rightHeight);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(curr, Math.max(leftDiameter, rightDiameter));
    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {

        /* TEST CASES
        * 1, 2, N, 3, 4 OR
        * 5, 8, 6, 3, 7, 9, N*/

        Node root = new Node(5);

        root.left = new Node(8);
        root.right = new Node(6);

        root.left.left = new Node(3);
        root.left.right = new Node(7);

        root.right.left = new Node(9);

        /*root.right.left = new Node(50);
        root.right.right = new Node(90);*/

        System.out.println(diameter(root));
    }
}
