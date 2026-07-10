package CodeSolving_DSA.LeetCode.Array_String;

public class ConvertSortedArrayIn_BinaryTree_108 {
    public TreeNode sortedArrayToBST(int []nums) {

        if (nums.length == 0) {
            return null;
        }

        return getBST(nums, 0, nums.length - 1);
    }

    private TreeNode getBST(int []nums, int left, int right) {

        // edge case : if negative values are greater than positive values  then return null
        // (as it is already sorted in ascending order)
        if (left > right) {
            return null;
        }

        // find out middle (root) element
        int mid = (left + right) / 2;

        // create a root node using mid
        TreeNode bst = new TreeNode(nums[mid]);

        bst.left = getBST(nums, left, mid -1);
        bst.right = getBST(nums, mid+1, right);

        return bst;
    }

    // inorder Traversal
    public void inOrder(TreeNode BST) {
        if (BST == null) {
            return;
        }

        inOrder(BST.left);
        System.out.print(BST.val + " ");
        inOrder(BST.right);
    }

    // preorder Traversal
    public void preOrder(TreeNode BST) {
        if (BST == null) {
            return;
        }

        System.out.print(BST.val + " ");
        preOrder(BST.left);
        preOrder(BST.right);
    }

    // postorder Traversal
    public void postOrder(TreeNode BST) {
        if (BST == null) {
            return;
        }

        postOrder(BST.left);
        postOrder(BST.right);
        System.out.print(BST.val + " ");
    }

    public static void main(String[] args) {
        ConvertSortedArrayIn_BinaryTree_108 cons = new ConvertSortedArrayIn_BinaryTree_108();
        int []nums = {-10, -3, 0, 5, 9};

        TreeNode root = cons.sortedArrayToBST(nums);

        System.out.println("Inorder Binary Tree is: ");
        cons.inOrder(root);

        System.out.println("\n");

        System.out.println("Preorder Binary Tree is: ");
        cons.preOrder(root);

        System.out.println("\n");

        System.out.println("PostOrder Binary Tree is: ");
        cons.postOrder(root);
    }
}
