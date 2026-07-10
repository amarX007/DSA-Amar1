package CodeSolving_DSA.LeetCode.Array_String;

import java.util.Arrays;

public class PlusOne_66 {
    public int[] plusOne(int []arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        int []newArray = new int[arr.length + 1];
        newArray[0] = 1;

        return newArray;
    }

    public static void main(String[] args) {
        PlusOne_66 cons = new PlusOne_66();

        int []arr = {9,9,9};

        int []ans = cons.plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
}
