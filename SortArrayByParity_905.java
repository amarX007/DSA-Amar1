package CodeSolving_DSA;

import java.util.Arrays;

 public class SortArrayByParity_905 {
    public static void main(String[] args) {
        int [] nums = {3,1,2,4};
        int [] result = ArraySort(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int [] ArraySort (int [] nums) {

        //naive approach
        int[] result = new int[nums.length];
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[ind++] = nums[i];
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                result[ind++] = nums[j];
            }
        }
        return result;


        //Efficient
        /*int j = 0; //j will track the position where to place next even number

        //traverse over the entire array
        for(int i = 0;  i<nums.length; i++){

            //comparing for even numbers
            if(nums[i] % 2 == 0){
                int temp = nums[i]; //swapping nums[i] with nums[j]
                nums[i] = nums[j];
                nums[j] = temp;

                j++; //increasing j (next even element)
            }
        }
        return nums;*/
    }
 }
