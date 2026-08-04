package CodeSolving_DSA.GeeksForGeeks.Array_String;

import java.util.Arrays;

public class MaxSum_SubarrayOf_SizeAt_least_K {
    public static int bruteForce(int []arr, int k) {
        int ans = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i=0; i<n; i++) {
            int sum  = 0;

            for (int j=i; j<n; j++) {
                sum = sum + arr[j];

                if (j - i + 1 >= k) {
                    ans = Math.max(ans, sum);
                }
            }
        }
        return ans;
    }

    public static int optimalApproach(int[] arr, int k) {
        int n = arr.length;

        // 1. Compute the sum of the first 'k' elements
        int currentWindowSum = 0;
        for (int i = 0; i < k; i++) {
            currentWindowSum += arr[i];
        }

        int maxSum = currentWindowSum;

        // 2. Track sliding window sums and trailing subarray elements
        int slidingSum = currentWindowSum;
        int trailingSum = 0;
        int minTrailingSum = 0; // Tracks the minimum prefix sum we can subtract

        for (int i = k; i < n; i++) {
            slidingSum += arr[i];          // Add the next element to the window
            trailingSum += arr[i - k];     // Track elements leaving the window from the left

            // If trailing elements have a negative cumulative sum, "cutting them off"
            // effectively expands our window size backwards to maximize the total sum.
            minTrailingSum = Math.min(minTrailingSum, trailingSum);

            // Total valid sum is the accumulated elements minus the worst-performing prefix
            int potentialMax = slidingSum - minTrailingSum;
            maxSum = Math.max(maxSum, potentialMax);
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int []arr = {1,2,3,-10,5};
        int k = 2;

        int ans = bruteForce(arr, k);

        System.out.println(ans);
    }
}
