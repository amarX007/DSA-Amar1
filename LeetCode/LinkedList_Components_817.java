package CodeSolving_DSA.LeetCode;

import java.util.HashSet;

public class LinkedList_Components_817 {
    public static int listComponents(Node head, int [] num) {
        if (head == null || num.length == 0) return 0;


        HashSet<Integer> numSet = new HashSet<>();

        for (int nums : num) {
            numSet.add(nums);
        }

        int count = 0;
        boolean inHead = false;

        Node bottle = head;

        while (bottle != null) {
            if (numSet.contains(bottle.data)) {
                if (!inHead) {
                    count++;
                    inHead = true;
                }
            }
            else {
                inHead = false;
            }
            bottle = bottle.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);


        int [] nums = {0,1,3};

        int result = listComponents(head, nums);

        System.out.println("Number of connected components are: " + result);
    }
}
