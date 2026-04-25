package CodeSolving_DSA.LeetCode;

public class Remove_Element_27 {
    public static int bruteForce(int [] num, int val) {
        int n = num.length;
        int i = 0;

        while (i < n) {
            if (num[i] == val) {
                for (int j = i; j<n-1; j++) {
                    num[j] = num[j+1];
                }
                n--;
            } else {
                i++;
            }
        }
        return i;
    }

    public static int optimalApproach(int [] nums, int val) {
        int n = nums.length;
        int k  = 0;

        for (int i=0; i<n; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,3,2,4,2,4};

        int res2 = optimalApproach(arr, 3);
        System.out.println(res2);
    }
}
