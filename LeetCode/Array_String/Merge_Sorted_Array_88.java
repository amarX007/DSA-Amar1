package CodeSolving_DSA.LeetCode.Array_String;

public class Merge_Sorted_Array_88 {
    public static void bruteForce(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];


        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n) {
            if (nums1[i] <= nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        while(i<m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while (j<n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }

        for (int N=0; N<m+n; N++) {
            nums1[N] = temp[N];
        }

        /*Complexities-
        * T.C - O(m+n)
        * S.C - O(m+n)
        */


    }
    public static void efficient(int[] nums1, int[] nums2, int m, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

//        efficient(nums1, nums2, 3,3);
        bruteForce(nums1 ,3, nums2, 3);

        System.out.println("Merged & sorted array is: ");
        for (int n : nums1) {
            System.out.print(n + " ");
        }
    }
}
