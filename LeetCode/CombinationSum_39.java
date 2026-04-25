package CodeSolving_DSA.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    // brute-force approach

    static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum (int [] candidate, int target) {
        dfs(0, target, candidate, new ArrayList<>());
        return result;
    }

    public void dfs(int index, int target, int [] candidates, List<Integer> curr) {

        // base
        if (target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        // base
        if (index == candidates.length) {
            return;
        }

        if (candidates[index] <= target) {
            curr.add(candidates[index]);

            dfs(index, target - candidates[index], candidates, curr);

            curr.remove(curr.size() - 1);
        }

        dfs(index + 1, target, candidates, curr);



    }

    public static void main(String[] args) {
        CombinationSum_39 cs = new CombinationSum_39();

        int [] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = cs.combinationSum(candidates, target);

        System.out.println(result);


    }
}
