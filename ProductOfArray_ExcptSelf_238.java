package CodeSolving_DSA;

public class ProductOfArray_ExcptSelf_238 {
    public static int[] productArr(int []nums){
        int n =nums.length;

        int[] ans = new int[n];

        /*Prefix loop*/
        ans[0] = 1;

        for (int i=1; i<n; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        /*Suffix loop*/
        int suffix = 1;
        for(int j=0; j<n; j++){
            int k = n-1-j;

            ans[k] *= suffix;
            suffix *= nums[k];
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};

        int []ans = productArr(nums);

        System.out.println("Product of the values except itself are: ");
        for (int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
