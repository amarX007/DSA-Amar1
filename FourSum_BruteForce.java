package CodeSolving_DSA;

import java.lang.reflect.Array;
import java.util.*;

//Brute-force
public class FourSum_BruteForce {
    //Brute-force
    public List<List<Integer>> approach1(int[] nums, int target) {
        HashSet<List<Integer>> ResultSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int I = k + 1; I < nums.length; I++) {
                        if (nums[i] + nums[j] + nums[k] + nums[I] == target) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[I]); //taking list to put all the elements in one line.

                            //temp.add(nums[i]);
                            //temp.add(nums[j]);  //also we can take arraylist and put all variables in different lines.
                            //temp.add(nums[k]);
                            //temp.add(nums[I]);

                            Collections.sort(temp);
                            ResultSet.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ResultSet);
    }

    //better
    /*public List<List<Integer>>approach2(int[] nums, int target) {
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
    }*/

    //optimal
    /*public List<List<Integer>> approach3(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ResultSet = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        ResultSet.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;

                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return ResultSet;
    }*/

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2}; // {1,0,-1,0,-2,2}
        int target = 2;

        FourSum_BruteForce fs = new FourSum_BruteForce();

        List<List<Integer>> output = fs.approach1(nums, target); //prints ap - 1
        System.out.println(output);

        /*output = fs.approach2(nums, target); //prints ap - 2
        System.out.println(output);*/

        /*output = fs.approach3(nums, target); //prints ap - 3
        System.out.println(output);*/

    }
}
