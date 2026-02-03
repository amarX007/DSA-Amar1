package CodeSolving_DSA;

/*
* S1- Handle edge case - e.g., head null/head.next = null/ k==0
* S2- Compute length and find tail
* S3 - Check and normalize k, again if k=0, then return head
* S4- Make the tail circular
* S5- Find new tail
* S6- Break the cycle
* S7- Return newTail
*/

public class RotateList_61 {
    public static Node rotateList(Node head, int k){
        //S1
        if(head == null || head.next == null || k == 0){
            return head;
        }

        //S2
        int length = 1;
        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        //S3
        k = k % length;
        if(k == 0){
            return head;
        }

        //S4
        tail.next = head;

        //S5
        int NT = length - k - 1;
        Node newTail = head;

        for (int i=0; i<NT; i++){
            newTail = newTail.next;
        }

        //S6
        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void display(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before rotation: ");
        display(head);

        head = rotateList(head, 2);
        display(head);
    }

}
