package CodeSolving_DSA;

import java.util.*;

public class FourSum_Better {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> ResultSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                HashSet<Long> TempSet = new HashSet<>();

                for (int k = j + 1; k < nums.length; k++) {
                    long Sum = nums[i] + nums[j];
                    Sum += nums[k];

                    long toFind = (target - Sum);
                    if (TempSet.contains(toFind)) {
                        List<Integer> quadruplets = Arrays.asList(nums[i], nums[j], nums[k], (int) toFind);
                        Collections.sort(quadruplets);
                        ResultSet.add(quadruplets);
                    }
                    TempSet.add((long) (nums[k]));
                }

            }
        }
        return new ArrayList<>(ResultSet);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        FourSum_Better Solver = new FourSum_Better();
        List<List<Integer>> Final = Solver.fourSum(nums, target);
        System.out.println(Final);

    }
}
