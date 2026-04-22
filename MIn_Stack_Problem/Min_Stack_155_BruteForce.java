package CodeSolving_DSA.MIn_Stack_Problem;

public class Min_Stack_155_BruteForce {
    private final int[] arr;
    private int firstValue;
    private final int cap;

    public Min_Stack_155_BruteForce(int c) {
        this.arr = new int[c];
        this.cap = c;
        this.firstValue = -1;
    }

    public boolean isEmpty() {
        return this.firstValue == -1;
    }

    public void push(int x) {
        if (this.firstValue == this.cap-1) {
            System.out.println("Error! Stack is full");
        } else {
            ++firstValue;
            this.arr[firstValue] = x;
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Error! Stack is empty");
            return Integer.MAX_VALUE;
        } else {
         int newElement = this.arr[firstValue];
         --firstValue;
         return newElement;
        }
    }

    public int top() {
        if (this.isEmpty()) {
            System.out.println("Error! Stack is empty");
            return Integer.MAX_VALUE;
        }
        return this.arr[firstValue];

    }

    public int getMin() {
        if (this.isEmpty()) {
            System.out.println("Error, Stack is empty!");
            return Integer.MAX_VALUE;
        }

        int min = arr[0];
        for (int i=0; i<=firstValue; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Min_Stack_155_BruteForce cons = new Min_Stack_155_BruteForce(100);

        System.out.println(cons.isEmpty());
        System.out.println("Capacity is: " + cons.cap);

        cons.push(-2);
        cons.push(8);
        cons.push(6);
        cons.push(2);
        cons.push(-7);
        cons.push(9);

        System.out.println("Min: " + cons.getMin());

        System.out.println(cons.top());
        System.out.println(cons.pop());

        System.out.println("Top: " + cons.top());
        System.out.println(cons.top());
    }
}
