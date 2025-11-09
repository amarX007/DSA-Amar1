package CodeSolving_DSA;

class SortColur_Better {
    public static void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        int n = nums.length;
        int N = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            nums[N++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            nums[N++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            nums[N++] = 2;
        }

    }
        /*for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            nums[i]= 2;
        }
    }*/

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
