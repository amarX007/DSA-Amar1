package CodeSolving_DSA.LeetCode.Array_String;

public class Rotate_Array_189 {

    // bad approach, time limit will exceed.
    public void bruteForce(int[] nums, int k) {
        int n = nums.length;

//        k = k%n;

        for (int N=0; N<k; N++) {
            int temp = nums[n-1];

            for (int i=n-1; i>0; i--) {
                nums[i] = nums[i-1];
            }

            nums[0] = temp;
        }
    }

    public void optimalApr(int[] nums, int k) {
        int n = nums.length;

        k = k%n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    private void reverse(int[] nums, int left, int right) {
        while (left<right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};

        Rotate_Array_189 cons = new Rotate_Array_189();


        System.out.println("Before rotation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

//        cons.bruteForce(nums, 4);
        cons.optimalApr(nums, 3);

        System.out.println("\nAfter Rotation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
