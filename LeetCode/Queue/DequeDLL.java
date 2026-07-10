package CodeSolving_DSA.LeetCode.Queue;

public class DequeDLL {
    private Node front;
    private Node rear;
    private int size;

    public DequeDLL() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void insertFront(int data) {
        Node mtEverest = new Node(data);

        if (isEmpty()) {
            front = rear = mtEverest;
        } else {
            mtEverest.next = front;
            front.prev = mtEverest;
            front = mtEverest;
        }
        size++;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return front.data;
    }

    public void removeFront() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        front = front.next;
        front.prev = null;
        size--;
    }


    public void insertRear(int data) {
        Node mtEverest = new Node(data);

        if (isEmpty()) {
            front = rear = mtEverest;
        } else {
            rear.next = mtEverest;
            mtEverest.prev = rear;
            rear = mtEverest;
        }
        size++;
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        } else {
            return rear.data;
        }
    }

    public void removeRear() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        rear = rear.prev;
        rear.next = null;
        size--;
    }

    int getSize() {
        return this.size;
    }



    public static void main(String[] args) {
        DequeDLL dl = new DequeDLL();

        dl.insertFront(10);
        dl.insertFront(20);
        dl.insertFront(30);

        dl.insertRear(11);

        dl.removeFront();
        dl.removeRear();
        System.out.println("Size: " +   dl.getSize());


        System.out.println("Front: "+ dl.getFront());
        System.out.println("Rear: " + dl.getRear());

    }
}

