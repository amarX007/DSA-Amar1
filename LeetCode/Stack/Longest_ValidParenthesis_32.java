package CodeSolving_DSA.LeetCode.Stack;

import java.util.Stack;

public class Longest_ValidParenthesis_32 {
    public static int longValidParen(String s) {
        int maxLen = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();


                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i-stack.peek());
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = ")()()()";

        System.out.println(longValidParen(s));
    }
}
