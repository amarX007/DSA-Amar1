package CodeSolving_DSA;

public class SubarraySum_Better {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int Result = maxSubArray(arr);
        System.out.println(Result);

    }

    public static int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];
        int Csum = arr[0];

        for (int i = 0; i < n; i++) {
            Csum = Math.max(arr[i], Csum + arr[i]);
            maxSum = Math.max(maxSum, Csum);
        }
        return maxSum;
    }
}
