package CodeSolving_DSA;

public class Container_WithMost_Water_11 {
    public static int bruteForce(int[] top) {
        int n = top.length;
        int maxArea = 0;

        for (int i=0; i<n; i++) {
            for (int j =i+1; j<n; j++) {
                int width = j-i;
                int height = Math.min(top[i], top[j]);
                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int ans = bruteForce(height);

        System.out.println(ans);
    }
}
