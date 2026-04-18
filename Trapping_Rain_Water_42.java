package CodeSolving_DSA;

public class Trapping_Rain_Water_42 {
    public static int bruteForce(int[] height) {
        int n = height.length;
        int total_water = 0;

        for (int i=0; i<n; i++) {
            int l_max = 0;
            for (int j=i-1; j>=0; j--) {
                if (height[j] > l_max) {
                    l_max = height[j];
                }
            }

            int r_max = 0;
            for (int k=i+1; k<n; k++) {
                if (height[k] > r_max) {
                    r_max = height[k];
                }
            }

            int result = (Math.min(l_max, r_max)) - height[i];

//            total_water += result <= 0 ? 0 : result;
            total_water += Math.max(result, 0);
        }
        return total_water;
    }

    public static int efficient(int[] height) {
        int n = height.length;

        int[] l_max = new int[n];
        int[] r_max = new int[n];

        int maxLeft = 0;
        int maxRight = 0;

        int totalWater = 0;

        for (int i=0; i<n; i++) {
            if (height[i] > maxLeft) {
                maxLeft = height[i];
            }
            l_max[i] = maxLeft;
        }

        for (int j=n-1; j>=0; j--) {
            if (height[j] > maxRight) {
                maxRight = height[j];
            }
            r_max[j] = maxRight;
        }

        for (int i=0; i<n; i++) {
            int res = Math.min(l_max[i], r_max[i]) - height[i];

            totalWater += Math.max(res, 0);
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

//       int ans = bruteForce(arr);
       int ans2 = efficient(arr);

//        System.out.println("Total trapped water: " + ans);
        System.out.println(ans2);
    }
}
