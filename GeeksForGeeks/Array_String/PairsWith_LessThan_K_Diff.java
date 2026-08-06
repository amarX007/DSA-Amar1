package CodeSolving_DSA.GeeksForGeeks.Array_String;

import java.util.Arrays;

public class PairsWith_LessThan_K_Diff {
    public static int pairsLessThanK(int arr[] , int k) {
        int n = arr.length;

        Arrays.sort(arr);

        int count = 0;
        int j = 0;

        for (int i=0; i<n; i++) {
            while (j < n && arr[j] - arr[i] < k) {
                j++;
            }
            count += (j-i-1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,7};
        int k = 3;

        int ans = pairsLessThanK(arr, k);

        System.out.println("Total pairs compare to K is: " + ans);
    }
}
