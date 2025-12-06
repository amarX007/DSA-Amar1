package CodeSolving_DSA;

public class LongestSubarraySumWTk_gfg {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,5,2,3,3};
        int k =11;

        System.out.println(longestSubarray(arr, k));
    }

    public static int longestSubarray(int []arr, int k){
        int length = 0;
        int n = arr.length;

        for(int i = 0; i<n; i++){

            int sum = 0;
            for (int j = i; j<n; j++){
                sum += arr[j];

                if(sum == k){
                    length = Math.max(length, j-i+1);
                }
            }
        }
        return length;
    }
}
