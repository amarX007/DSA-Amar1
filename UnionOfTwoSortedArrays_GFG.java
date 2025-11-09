package CodeSolving_DSA;

import java.util.Arrays;

public class UnionOfTwoSortedArrays_GFG {
    static void main(String[]args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,6,7};

        int [] union = FindElement(arr1, arr2);

        System.out.println("Union of two arrays: ");
        for(int i = 0; i< union.length; i++){
            System.out.print(union[i] + " ");
        }

    }

    public static int[] FindElement(int [] arr1, int [] arr2){
        int m = arr1.length;
        int n = arr2.length;

        int [] result = new int [m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
               if(k == 0 || result[k-1] != arr1[i]){
                   result[k] = arr1[i];
                   k++;
               }
               i++;
            } else if (arr2[j] <= arr1[i]) {
                if(k == 0 || result[k-1] != arr2[j]){
                    result[k] = arr2[j];
                    k++;
                }
                j++;
            }else {
                if(k == 0 || result[k-1] != arr1[i]){
                    result[k] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while(i<m){
            if(k == 0 || result[k-1] != arr1[i]){
                result[k] = arr1[i];
                k++;
            }
            i++;
        }

        while(j<n){
            if(k == 0 || result[k-1] != arr2[j]){
                result[k] = arr2[j];
                k++;
            }
            j++;
        }
        return Arrays.copyOf(result, k);
    }
}
