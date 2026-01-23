package CodeSolving_DSA;

public class Palindrome_LL_234 {
    /*IDEA:
    * S1: Base case- If head and next of head is null, then return head.
    * S2: Find middle- Will use 2 pointers, fast runs 2 step ahead, slow runs 1 step.
    * S3: Handle odd length - Slow become the middle
    * S4: Reverse second half
    * S5: Compare both segmentation
    * */
    public boolean palindromeLinkedList(Node head){
        //base case
        if(head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        //find Middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //handle odd length
        if(fast != null){
            slow = slow.next;
        }

        //reverse second half
        Node prev = null;
        Node curr = slow;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //compare both seg.
        Node first = head;
        Node second = prev;

        while(second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(5);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);

        Palindrome_LL_234 pl = new Palindrome_LL_234();

        System.out.println(pl.palindromeLinkedList(head));


    }
}
