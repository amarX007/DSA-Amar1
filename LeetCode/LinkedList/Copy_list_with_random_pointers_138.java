package CodeSolving_DSA.LeetCode.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Copy_list_with_random_pointers_138 {
    public Node bruteForce(Node head) {
        Map<Node, Node> map = new HashMap<>();

        // Step 1 - Make a Node
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        // Step 2 - Assign values
        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);

            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);

            curr = curr.next;
        }
        return map.get(head);
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            int randomValue;
            if (temp.random != null) {
                randomValue = temp.random.data;
            } else {
                randomValue = -1;
            }
            System.out.println(temp.data + " -> " + randomValue);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Copy_list_with_random_pointers_138 cons = new Copy_list_with_random_pointers_138();

        // assigning Node values
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);

        // assigning random values
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next;
        head.next.next.next.random = null;

        Node res =  cons.bruteForce(head);

        System.out.println("Original Node: ");
        printList(head);

        System.out.println("\nRandom Node: ");
        printList(res);

    }
}
