package CodeSolving_DSA.MIn_Stack_Problem;

public class Optimal {
    private final int[] arr;
    private final int[] minArr;
    private int firstValue;
    private final int cap;


    public Optimal() {
        this.cap = 300001;
        this.firstValue = -1;
        this.arr = new int[cap];
        this.minArr = new int[cap];
    }

    public boolean isEmpty() {
        return this.firstValue == -1;
    }

    public void push(int n) {
        if (this.firstValue == this.cap-1) {
            System.out.println("Error, Stack is full!");
        } else {
            ++firstValue;
            this.arr[firstValue] = n;

            if (firstValue == 0) {
                this.minArr[firstValue] = n;
            } else {
                if (n < minArr[firstValue - 1]) {
                    this.minArr[firstValue] = n;
                } else {
                    minArr[firstValue] = minArr[firstValue - 1];
                }
            }
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Error, stack empty!");
            return Integer.MAX_VALUE;
        }else {
            int newELe = this.arr[firstValue];
            --firstValue;
            return newELe;
        }

    }

    public int top() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return this.arr[firstValue];
        }
    }

    public int getMin() {
        if (this.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return this.minArr[firstValue];
        }
    }

    public static void main(String[] args) {
        Optimal cons = new Optimal();

        System.out.println(cons.isEmpty());

        cons.push(3);
        cons.push(4);
        cons.push(2);
        cons.push(5);
        cons.push(1);

        System.out.println("Top: " + cons.top());
//        System.out.println("Pop: " + cons.pop());
        System.out.println("Top: " + cons.top());
        System.out.println(cons.getMin());
    }
}
