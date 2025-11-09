package CodeSolving_DSA;

import java.util.Arrays;

public class SortColors_Optimal {
    public static void sortColors(int[] nums) {
        int i = 0, j = 0, k = nums.length - 1;

        while (j <= k) {
            if (nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[j] == 1) {
                j++;
            } else { // nums[j] == 2
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
