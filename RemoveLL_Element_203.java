package CodeSolving_DSA;

public class RemoveLL_Element_203 {
    public Node removeElement(Node head, int data){
        Node empty = new Node(0);
        empty.next = head;

        Node curr = empty;

        while(curr.next != null){
            if(curr.next.data == data){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return empty.next;
    }
    public void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveLL_Element_203 re = new RemoveLL_Element_203();

        Node head = new Node(7);
        head.next = new Node(7);
        head.next.next = new Node(7);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(7);

        System.out.println("Before removing element: ");
        re.display(head);

        System.out.println("After removing duplicate elements: ");
        head = re.removeElement(head, 7);
        re.display(head);
    }
}
