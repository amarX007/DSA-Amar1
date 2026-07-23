package CodeSolving_DSA.GeeksForGeeks.Array_String;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum_PairWith_GivenSum {

    // using HashSet
    public static boolean twoSum(int []arr, int target) {
        HashSet<Integer> result = new HashSet<>();

        for (int i=0; i<arr.length; i++) {
            int complement = target - arr[i];

            if (result.contains(complement)) {
                return true; // if twoSum found
            }

            result.add(arr[i]);
        }
        return false; // if twoSum not found
    }

    // using Two Pointers
    public static boolean twoSuM(int []arr, int target) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                return true;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int []arr = {2, -2, 0, 5, 0};

        int target = -3;

        System.out.println(twoSuM(arr, target));
    }
}
