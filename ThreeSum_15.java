package CodeSolving_DSA;

import java.util.*;

public class ThreeSum_15 {

    //brute-force approach - Good in Normal java compilers, but will not valid for online platforms.
    /*public static List<List<Integer>> approach1(int []nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);

                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }*/

    static List<List<Integer>> approach2(int []nums){
        List<List<Integer>> res = new ArrayList<>();

        int n  = nums.length;

        for(int i = 0; i < n; i++){
            Set<Integer> visit = new HashSet<>();

            for(int j = i+1; j<n; j++){
                int need = nums[i] - nums[j];

                if(visit.contains(need)){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], need);
                    Collections.sort(triplet);
                    res.add(triplet);
                }
                visit.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }

    //Efficient approach - using sorting & 2 pointers
    public static List<List<Integer>> approach3(int []nums){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i =0; i<n-2; i++){

            //skip duplicates
            if( i > 0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = nums.length - 1;

            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));


                    l++;
                    r--;

                    //skipping duplications
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                } else if (sum<0) {
                    l++;
                }else{
                    r--;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {-1, 0, 1, 2, -1, -4};

        /*List<List<Integer>> result1 = approach1(nums);
        System.out.println("The result of approach1 is: " + result1);*/

        List<List<Integer>> result2 = approach2(nums);
        System.out.println("The result of approach2 is: " + result2);

        List<List<Integer>> result3 = approach3(nums);
        System.out.println("The result of approach3 is: " + result3);
    }
}
