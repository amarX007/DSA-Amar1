package CodeSolving_DSA.LeetCode.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue_225 {
    public Queue<Integer> q1;
    public Queue<Integer> q2;

    public StackUsingQueue_225() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();

    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue_225 stack = new StackUsingQueue_225();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());

        stack.push(55);

        System.out.println("Top: " + stack.top());

        System.out.println("\nRemoving all elements of the stack: ");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }


        System.out.println("\nIs empty: " + stack.empty());
    }
}
