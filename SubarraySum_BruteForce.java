package CodeSolving_DSA;

public class SubarraySum_BruteForce {
    public int subarraysum(int nums[], int k) {
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

    public static void main(String[] args) {
        SubarraySum_BruteForce Sol = new SubarraySum_BruteForce();
        int[] nums = {1, 2, 3};
        int k = 2;

        int finalResult = Sol.subarraysum(nums, k);
        System.out.println(finalResult);
    }
}

