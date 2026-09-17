package CodeSolving_DSA.GFG_90_Days.Array;

public class Rotate_Array {
    public static void rotateArray (int []arr, int k) {
        int n = arr.length;

        k = k%n;

        helper(arr, 0, n-1);
        helper(arr, 0, k-1);
        helper(arr, k, n-1);
    }

    public static void helper (int arr[],int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int k = 3;

        System.out.print("Before rotating the Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotateArray(arr, k);
        System.out.print("\nAfter rotating the Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
