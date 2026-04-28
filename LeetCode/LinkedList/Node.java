package CodeSolving_DSA.LeetCode.LinkedList;

public class Node {
    int data;
    Node next;
    boolean visited;
    Node random;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.visited = false; // question-wise use cases (not used in every code)
        this.random = null; // question-wise use cases only (not used in every code)
    }
}
