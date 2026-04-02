package CodeSolving_DSA;

import java.util.ArrayList;
import java.util.Stack;

public class Previous_GreaterElement_GFG {
    public static ArrayList<Integer> bruteForce(int [] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i=0; i<n; i++) {
            int ans = -1;
            for (int j=i-1; j>=0; j--) {
                if (arr[j] > arr[i]) {
                    ans = arr[j];
                    break;
                }

            }
            result.add(ans);
        }
        return result;
    }


    public static ArrayList<Integer> optimalApproach(int [] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i=0; i<n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                list.add(-1);
            }else {
                list.add(arr[stack.peek()]);
            }
            stack.push(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int [] arr = {40,20,30,10,50};

        ArrayList<Integer> ans = bruteForce(arr);
        ArrayList<Integer> ans2 = optimalApproach(arr);
        System.out.println(ans2);
    }
}
