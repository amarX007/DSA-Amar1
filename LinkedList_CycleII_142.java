package CodeSolving_DSA;

public class LinkedList_CycleII_142 {
    public static Node detectCycle(Node head){
        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;

        //s1- detect cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){

                //detect entry point
                Node entry = head;

                while(entry != slow){
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }
        return null;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        Node result = detectCycle(a);

        if(result != null){
            System.out.println("Cycle starts at node with values: " + result.data);
        } else {
            System.out.println("No cycle");
        }
    }
}
