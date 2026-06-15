package CodeSolving_DSA.GeeksForGeeks.Array_String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveAll_Zeros_ToEnd {
    public static void bruteForce(int[] arr) {
        /* We have to solve this using an extra array
        * 1. take a variable to track non-zero element
        * 2. traverse thorough the array
        * 3. if non-zero element found then add it into the new array and increase value
        * 4. in the end - copy the new array's values into the main array
        * */

        int n = arr.length;
        int[] arr2 = new int[n];

        int index = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] != 0) {
                arr2[index] = arr[i];
                index++;
            }
        }

        for (int i=0; i<n; i++) {
            arr[i] = arr2[i];
        }

        System.out.println("Solved array is: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};

        bruteForce(arr);
    }
}
