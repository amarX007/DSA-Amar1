package CodeSolving_DSA;

 public class BestTimeToBuySell_Stock_II_122 {
    public static void main(String[] args) {

        int arr[] = {7, 1, 5, 3, 6, 4};

        BestTimeToBuySell_Stock_II_122 obj = new BestTimeToBuySell_Stock_II_122();
        int result = obj.maxProfit(arr);
        System.out.println(result);
    }

    //Brute-Force
    /*public static int helper(int []arr, int start) {
        int n = arr.length;
        if(start >= n){
            return 0;
        }

        int maxProf = 0;
        for(int i = start; i<n; i++){
            int profit = 0;
            for(int j = i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    int curProf = (arr[j] - arr[i]) + helper(arr, j+1);
                    profit = Math.max(profit, curProf);
                }
            }
            maxProf = Math.max(maxProf,profit);
        }
        return maxProf;
    }
    public int maxProfit(int [] arr){
        return helper(arr, 0);
    }*/


     //Efficient
    public int maxProfit(int [] arr){
        int profit = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
 }
