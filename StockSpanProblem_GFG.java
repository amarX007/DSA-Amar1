package CodeSolving_DSA;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem_GFG {
    public ArrayList<Integer> bruteForce(int [] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int n = arr.length;

        for (int i=0; i<n; i++) {
            int span = 0;

            for (int j=i; j>=0; j--){
                if (arr[j] <= arr[i]){
                    span++;
                } else {
                    break;
                }
            }
            result.add(span);
        }
        return result;
    }

    public ArrayList<Integer> efficientApproach(int [] arr) {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i=0; i< arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                span.add(i+1);
            } else {
                span.add(i - st.peek());
            }
            st.push(i); 
        }
        return span;
    }

    public static void main(String[] args) {
        int [] arr = {100,80,90,120};
        int [] arr2 = {100, 30, 20, 101};

        StockSpanProblem_GFG ss = new StockSpanProblem_GFG();

        ArrayList<Integer> result = ss.bruteForce(arr);
        ArrayList<Integer> result2 = ss.efficientApproach(arr2);


        System.out.println(result);
        System.out.println(result2);
    }
}
