package CodeSolving_DSA.LeetCode.LinkedList;

import java.util.*;

public class Merge_Two_Sorted_List_21 {
    public Node bruteForce(Node list1, Node list2) {

        List<Integer> arr = new ArrayList<>();

        while (list1 != null) {
            arr.add(list1.data);
            list1 = list1.next;
        }

        while (list2 != null) {
            arr.add(list2.data);
            list2 = list2.next;
        }

        Collections.sort(arr);

        Node head = new Node(-1);
        Node temp = head;

        for (int val : arr) {
            temp.next = new Node(val);
            temp = temp.next;
        }
        return head.next;
    }

    public Node Optimal(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Merge_Two_Sorted_List_21 cons = new Merge_Two_Sorted_List_21();

        Node l1 = new Node(1);
        l1.next = new Node(2);
        l1.next.next = new Node(4);

        Node l2 = new Node(1);
        l2.next = new Node(3);
        l2.next.next = new Node(4);

//        Node result = cons.bruteForce(l1, l2);
        Node result = cons.Optimal(l1, l2);

        while(result != null) {
            System.out.print(result.data + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }

}
