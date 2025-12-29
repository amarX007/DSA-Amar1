package CodeSolving_DSA;

/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.*/
public class SubarraySum_BruteForce {

    //Brute-force approach
    public static int subarraysum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    //Better approach
    /*public static int subarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];
        int Csum = arr[0];

        for (int j : arr) {
            Csum = Math.max(j, Csum + j);
            maxSum = Math.max(maxSum, Csum);
        }
        return maxSum;
    }*/

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int k = 2;

        int BruteForce_res = subarraysum(nums, k);
        System.out.println(BruteForce_res);

        /*int Better_res = subarraySum(nums);
        System.out.println(Better_res);*/
        }
}

