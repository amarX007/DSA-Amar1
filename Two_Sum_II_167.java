package CodeSolving_DSA;

import java.util.Arrays;

public class Two_Sum_II_167 {
    public int[] bruteForce(int []numbers, int target) {
        int n = numbers.length;

        for (int i=0; i<n; i++) {
            for (int j = i+1; j<n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i+1, j+1};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public int[] optimalApproach(int[] nums, int target) {
        // take two pointers
        // one from the starting - left
        // one from the ending - right

        // while - left is smaller than right
        // sum = left + right (index)
        // if - sum matches with target then return the sum value
        // if sum is greater than target then decrease the right side value
        // is sum is less than target then increase the left side value

        // if all values gets false, then return the function
        int n = nums.length;

        int i = 0; // left
        int j = n - 1; //right

        while (i<j) {
            int sum = (nums[i] + nums[j]);

            if (sum == target) {
                return new int[] {i+1, j+1};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int [] numbers = {2,3,6,7,8};

        Two_Sum_II_167 constructor = new Two_Sum_II_167();

        int[] bruteForce = constructor.bruteForce(numbers, 15);
        int[] optimalAppr = constructor.optimalApproach(numbers, 13);

        System.out.println("Answer is: " + Arrays.toString(bruteForce));
        System.out.println("Ans: " + Arrays.toString(optimalAppr));
    }
}
