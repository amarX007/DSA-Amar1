package CodeSolving_DSA.GeeksForGeeks;

public class RemoveLoop_LL_GFG {
    Node head;

    //insert function for data entry
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //creating loopNode for the Position
    public void createLoop(int pos) {
        if (head == null || pos <= 0) return;

        Node loopNode = null;
        Node temp = head;
        int count = 1;

        while (temp.next != null) {
            if (count == pos) {
                loopNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = loopNode;
    }


    //naive approach
   /* public void removeLoop(){
        if(head == null) return;

        HashSet<Node> set = new HashSet<>();
        Node curr = head;
        Node prev = null;


        while(curr != null){
            if(set.contains(curr)){
                prev.next = null;
                return;
            }
            set.add(curr);
            prev = curr;
            curr = curr.next;
        }
    }*/

    //efficient approach
    void removeLoop2() {
        if (head == null) return;


        Node slow = head;
        Node fast = head;


        //detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }

        //in case: no cycle
        if(fast == null || fast.next == null){
            System.out.println("no cycle!");
            return;
        }

        //remove cycle
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
    }

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null!");
    }

    public static void main(String[] args) {
        RemoveLoop_LL_GFG nodes = new RemoveLoop_LL_GFG();

        nodes.insert(11);
        nodes.insert(13);
        nodes.insert(16);
        nodes.insert(19);

        nodes.createLoop(2);


        nodes.removeLoop2();
        nodes.display();

    }
}

