package CodeSolving_DSA;

public class Remove_Nth_NodeFromEnd_19 {

    /*
     * HOW WE ARE GOING TO SOLVE IT?
     * s1 - Create a dummy node and link its next to head to simplify edge cases
     * s2 - Initialize two pointers (fast and slow) starting at the dummy node
     * s3 - Move the fast pointer n + 1 steps ahead to create a fixed gap
     * s4 - Move both pointers together until the fast pointer reaches null
     * s5 - At this point, slow is just before the target node; skip slow.next
     * s6 - Return dummy.next as the updated head
     *
     * T.C - O(n)
     * S.C - O(1)
     */

    public static Node removeNthFromEnd(Node head, int n){

        //dummy node
        Node empty = new Node(0);
        empty.next = head;

        //initializing TWO pointers
        Node fast = empty;
        Node slow = empty;

        //moving the fast pointer to the n+1 th position
        for (int i=0; i<=n; i++){
            fast = fast.next;
        }

        //moving both pointers until the fast becomes null
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        //skip the target node
        slow.next = slow.next.next;

        return empty.next;
    }

    //function to print the value
    public static void printList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list: ");
        printList(head);

        int n = 2;

        head = removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "nd node from end: ");
        printList(head);
    }
}
