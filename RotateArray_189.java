package CodeSolving_DSA;

import java.util.Arrays;

public class RotateArray_189 {
    public static void rotateArray(int [] nums, int k){
        int n = nums.length;

        //edge case
        if(n <= 1) return;

        //normalize k
        k = k % n;
        if (k == 0) return;

        //s1 - reverse the entire array
        swap(nums, 0, n-1);

        //s2 - reverse first k elements
        swap(nums, 0, k-1);

        //s3 - reverse remaining elements
        swap(nums, k, n-1);

    }

    public static void swap(int []nums, int left, int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        System.out.println("before rotation: ");
        System.out.println(Arrays.toString(nums));

        rotateArray(nums, k);

        System.out.println("After rotation: ");
        System.out.println(Arrays.toString(nums));

    }
}
