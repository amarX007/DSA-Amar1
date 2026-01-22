package CodeSolving_DSA;

import java.util.ArrayList;

public class Reverse_LL_206 {
    //Naive approach
    public Node approach1(Node head){
        if(head == null || head.next == null){
            return head;
        }

        ArrayList<Integer>list = new ArrayList<>();

        Node curr = head;
        while(curr != null){
            list.add(curr.data);
            curr = curr.next;
        }

        int i=0;
        curr = head;
        while(curr != null){
            curr.data = list.get(list.size()-1-i);
            curr = curr.next;
            i++;
        }
        return head;
    }

    //Efficient approach
    public Node approach2(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void displayValue(Node head){
        Node N = head;
        System.out.println("the list is: ");
        while(N != null){
            System.out.print(N.data + " ");
            N = N.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(50);
        head.next.next.next = new Node(70);
        head.next.next.next.next = new Node(90);

        Reverse_LL_206 rl = new Reverse_LL_206();

        System.out.print("Before reversing ");
        displayValue(head);

        /*head = rl.approach1(head);*/
        head = rl.approach2(head);
        System.out.print("After reversing ");
        displayValue(head);

    }
}
