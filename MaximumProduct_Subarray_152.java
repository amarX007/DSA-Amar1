package CodeSolving_DSA;

public class MaximumProduct_Subarray_152 {

    //naive approach
    public static int approach1(int []nums){

        int res = nums[0];
        for (int i=0; i<nums.length; i++){
            int currProduct = 1;

            for (int j=i; j<nums.length; j++){
                currProduct = currProduct * nums[j];

                res = Math.max(res, currProduct);
            }
        }
        return res;
    }

    //efficient approach - Kadane's theory
    public static int approach2(int[] nums){
        int res = nums[0];
        int maxEnd = nums[0];
        int minEnd = nums[0];

        for (int i=1; i<nums.length; i++){
            int cur = nums[i];

            int tempMax = Math.max(cur, Math.max(maxEnd * cur , minEnd * cur));

            minEnd = Math.min(cur, Math.min(maxEnd * cur, minEnd * cur));

            maxEnd = tempMax;

            res = Math.max(res, maxEnd);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 0, 7, 1};

        int res = approach1(nums);
        int res2 = approach2(nums);

        System.out.println(res2 + " ");
    }
}
