package CodeSolving_DSA.GeeksForGeeks.Tree;

import java.util.ArrayList;

public class K_DistanceFrom_Root {
//    Node root;
    public static ArrayList<Integer> kDistance(Node root, int k) {

        ArrayList<Integer> answer = new ArrayList<>();

        helpingFunction(root, k, answer);

        return answer;
    }

    static void helpingFunction(Node root, int k, ArrayList<Integer>answer) {
        if (root == null) {
            return;
        }

        if (k == 0) {
            answer.add(root.data);
            return;
        }

        helpingFunction(root.left, k-1, answer);
        helpingFunction(root.right, k-1, answer);
    }

    public static void main(String[] args) {
        Node root = new Node(9);

        root.left = new Node(2);
        root.right = new Node(4);


        root.left.left = new Node(6);
        root.right.right = new Node(8);

        int k = 2;
        ArrayList<Integer> ans = kDistance(root, k);

        System.out.println(ans);
    }
}
