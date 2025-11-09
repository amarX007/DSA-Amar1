package CodeSolving_DSA;

import java.lang.reflect.Array;
import java.util.*;

public class FourSum_BruteForce {
    public List<List<Integer>> FourSum(int[] nums, int target) {
        HashSet<List<Integer>> ResultSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int I = k + 1; I < nums.length; I++) {
                        if (nums[i] + nums[j] + nums[k] + nums[I] == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[I]); //taking list to put all the elements in one line.

                            /*temp.add(nums[i]);
                            temp.add(nums[j]);  //also we can take arraylist and put all variables in different lines.
                            temp.add(nums[k]);
                            temp.add(nums[I]);*/

                            Collections.sort(temp);
                            ResultSet.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ResultSet);
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2}; // {1,0,-1,0,-2,2}
        int target = 8;

        FourSum_BruteForce Solver = new FourSum_BruteForce();
        List<List<Integer>> output = Solver.FourSum(nums, target);
        System.out.println(output);

    }
}
