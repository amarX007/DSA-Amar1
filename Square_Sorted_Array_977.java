package CodeSolving_DSA;

import java.util.Arrays;

public class Square_Sorted_Array_977 {
    public int[] bruteForce(int [] nums) {
        int n = nums.length;

        int []result = new int[n];

        for (int i=0; i<n; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);

        return result;
    }

    public int[] efficientApr(int []nums) {
        int n = nums.length;

        int left = 0;
        int right = n-1;

        int []result = new int[n];
        int k = n-1; // for filling

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[k] = leftSquare;
                left++;
            } else {
                result[k] = rightSquare;
                right--;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums = {-4,2,-1,3,5};

        Square_Sorted_Array_977 cons = new Square_Sorted_Array_977();

        int []result = cons.bruteForce(nums);
        int [] res2 = cons.efficientApr(nums);

//        System.out.println(Arrays.toString(result));
        System.out.println("The efficient approach is: " + Arrays.toString(res2));
    }
}
