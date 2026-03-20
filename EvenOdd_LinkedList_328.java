package CodeSolving_DSA;

public class EvenOdd_LinkedList_328 {
    public Node oddEvenList(Node head) {

        // handle edge case
        if (head == null) {
            System.out.println("Head is empty");
            return null;
        }

        // take 3 pointers to track even, odd & connect them
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {

            // to point out odd nodes
            odd.next = even.next;
            odd = odd.next;

            // to point out even nodes
            even.next = odd.next;
            even = even.next;
        }
        // connect both nodes
        odd.next = evenHead;

        return head;
    }

    public void printResult(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        EvenOdd_LinkedList_328 solution = new EvenOdd_LinkedList_328();
        head = solution.oddEvenList(head);

        solution.printResult(head);
    }
}
