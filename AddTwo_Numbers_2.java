package CodeSolving_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


 public class AddTwo_Numbers_2 {
     //Using ArrayList
     public static List<Integer> addTwoNumbers(int[] l1, int[] l2) {
        List<Integer> Result = new ArrayList<>();
        int i = l1.length - 1;
        int j = l2.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int x = 0;
            int y = 0;
            if (i >= 0) {
                x = l1[i];
                i--;
            }
            if (j >= 0) {
                y = l2[j];
                j--;
            }
            int Sum = x + y + carry;
            carry = Sum / 10;
            Result.add(Sum % 10);
        }
        Collections.reverse(Result);
        return Result;
    }

    //Main method for ArrayList
    public static void main(String[] args) {
        int[] l1 = {3, 4, 2};
        int[] l2 = {6, 4, 5};


        List<Integer> Sum = addTwoNumbers(l1, l2);
        System.out.println("Result is: " + Sum);
    }


}

