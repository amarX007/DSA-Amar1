package CodeSolving_DSA;

public class Node {
    int data;
    Node next;
    boolean visited;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.visited = false;
    }
}
