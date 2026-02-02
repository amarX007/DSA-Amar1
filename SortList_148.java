package CodeSolving_DSA;

public class SortList_148 {
    public Node sortList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        //finding node and split
        Node middle = getMiddle(head);

        //recursively sorting both halves
        Node left = sortList(head);
        Node right = sortList(middle);

        return merge(left, right);

    }

    public Node getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        return slow;
    }

    public Node merge(Node l1, Node l2){
        Node dum = new Node(0);
        Node curr = dum;

        while (l1 != null && l2 != null){
            if(l1.data <= l2.data){
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null){
            curr.next = l1;
        }else {
            curr.next = l2;
        }

        return dum.next;
    }

    public static void displayList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);

        SortList_148 sl = new SortList_148();

        System.out.println("Before sorting the list: ");
        displayList(head);

        head = sl.sortList(head);

        System.out.println("After sorting the list: ");
        displayList(head);
    }
}
