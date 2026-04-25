package CodeSolving_DSA.LeetCode;

public class Remove_Duplicate_From_SortedArray_II_80 {
    public int bruteForce(int[] nums) {
        int i = 0;
        int s = nums.length;

        while (i<s) {
            int count = 1;
            int j = i+1;

            while (j<s && nums[j] == nums[i]) {
                count++;
                j++;
            }

            // if count is greater than 2
            if (count > 2) {
                int more = count - 2;

                // shifting more to the left
                for (int N = 0; N < more ; N++) {
                    for (int n = j - more; n < s-1; n++) {
                        nums[n] = nums[n+1];
                    }
                    s--;
                }
            }
            i += Math.min(count, 2);
        }
        return s;
    }

    public int optimalApr(int[] nums) {
        int n = nums.length;

        if (n <= 2) {
            return n;
        }

        int k = 2;

        for(int i=2; i<n; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,4,4,4,4,5};

        Remove_Duplicate_From_SortedArray_II_80 cons = new Remove_Duplicate_From_SortedArray_II_80();

//        System.out.println("The current size is: " + cons.bruteForce(nums));
        System.out.println(cons.optimalApr(nums));

    }
}
