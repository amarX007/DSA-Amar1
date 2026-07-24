package CodeSolving_DSA.LeetCode.Tree;


import com.sun.source.tree.Tree;

public class Construct_BinaryTree_FromPreorderInorder_Traversal_105 {
    int preIdx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return treeBuilder(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode treeBuilder(int[] preorder, int[] inorder, int start, int end) {

        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIdx++]);

        if (start == end) {
            return root;
        }

        int rootIndex = start;
        while (inorder[rootIndex] != root.val) {
            rootIndex++;
        }

        root.left = treeBuilder(preorder, inorder, start, rootIndex - 1);
        root.right = treeBuilder(preorder, inorder, rootIndex + 1, end);

        return root;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.val + " ");
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Construct_BinaryTree_FromPreorderInorder_Traversal_105 cons =
                new Construct_BinaryTree_FromPreorderInorder_Traversal_105();

        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = cons.buildTree(preorder, inorder);

        System.out.println("PreeOrder: ");
        preOrder(root);

        System.out.println("\n");


        System.out.println("InOrder: ");
        inOrder(root);
    }
}
