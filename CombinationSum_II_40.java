package CodeSolving_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_II_40{
    public List<List<Integer>> combinationSum2 (int [] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        backTrack(0, target, arr, new ArrayList<>(), result);
        return result;
    }

    public void backTrack (int start, int target, int [] arr, List<Integer> values, List<List<Integer>> result) {
        // base
        if (target == 0){
            result.add(new ArrayList<>(values));
        }

        if (start == arr.length) return;


        for (int i = start; i<arr.length; i++) {

            if (start < i && arr [i] == arr [i-1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            values.add(arr[i]);

            //move next
            backTrack(i+1, target - arr[i], arr, values, result);

            values.remove(values.size() -1);
        }
    }

    public static void main(String[] args) {
        CombinationSum_II_40 cs = new CombinationSum_II_40();

        int [] arr = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> res = cs.combinationSum2(arr, target);

        for (List <Integer> list : res) {
            System.out.println(list);
        }
    }
}
