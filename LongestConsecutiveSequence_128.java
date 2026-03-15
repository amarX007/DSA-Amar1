package CodeSolving_DSA;

import java.util.HashSet;

public class LongestConsecutiveSequence_128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set){

            //start of sequence
            if(!set.contains(num-1)){

                int curr = num;
                int len = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int [] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }

}
