package CodeSolving_DSA;

public class Reverse_LL2_92 {
    public Node reverseBW(Node head, int left, int right){
        if(head == null || head.next == null){
            return head;
        }

        Node dum = new Node(0);
        dum.next = head;

        //moving left node
        Node prev = dum;
        for(int i=1 ; i<left; i++){
            prev = prev.next;
        }

        //reverse SubList
        Node curr = prev.next;
        Node prevSub = null;

        for (int i=0; i<right - left + 1; i++){
            Node next = curr.next;
            curr.next = prevSub;
            prevSub = curr;
            curr = next;
        }

        //reconnect nodes
        prev.next.next = curr;
        prev.next = prevSub;

        return dum.next;
    }

    public void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse_LL2_92 rll = new Reverse_LL2_92();

        Node head = new Node(5);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before reversing: ");
        rll.printList(head);

        System.out.println("After reversing: ");
        head = rll.reverseBW(head, 2,4);
        rll.printList(head);
    }
}
