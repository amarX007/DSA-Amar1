package CodeSolving_DSA;

public class TwoStackInArray_GFG {
    private int [] arr;
    private int capacity;
    private int firstValue;
    private int secondValue;

    public TwoStackInArray_GFG(int n) {
        this.arr = new int[n];
        this.capacity = n;
        this.firstValue = -1;
        this.secondValue = n;
    }

    // apply this in online platforms, cause there are so many invisible test cases
    /*TwoStackInArray () {
        this(100);
    }*/

    void push1(int x) {
        if (firstValue + 1 == secondValue) {
            System.out.println("Stack Overflow!");
            return;
        }
        ++firstValue;
        arr[this.firstValue] = x;

    }

    void push2(int x) {
        if (firstValue + 1 == secondValue) {
            System.out.println("Overflow");
            return;
        }
        --secondValue;
        arr[this.secondValue] = x;
    }

    int pop1 () {
        if (this.firstValue == -1) {
            return -1;
        } else {
            int ele = arr[firstValue];
            firstValue--;
            return ele;
        }
    }

    int pop2 () {
        if (this.secondValue == capacity) {
            return -1;
        } else {
            int ele = arr[secondValue];
            secondValue++;
            return ele;
        }
    }

    public static void main(String[] args) {
        TwoStackInArray_GFG stack = new TwoStackInArray_GFG(5);

        stack.push1(1);
        stack.push2(2);
        System.out.println(stack.pop1());
        stack.push1(3);

        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
    }
}
