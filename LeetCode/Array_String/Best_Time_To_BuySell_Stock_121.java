package CodeSolving_DSA.LeetCode.Array_String;

public class Best_Time_To_BuySell_Stock_121 {
    public int bruteForce(int[] prices) {
        int n = prices.length;
        int MaxProfit = 0;


        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int profit = prices[j] - prices[i];
                if(MaxProfit < profit){
                    MaxProfit = profit;
                }
            }
        }
        return MaxProfit;
    }

    public int efficient(int[] prices) {
        int n = prices.length;
        int MaxProfit = 0;
        int InitialPrice = prices[0];


        for(int i = 0; i<n; i++){
            int CurrentProfit = prices[i] - InitialPrice;

            if(CurrentProfit > MaxProfit){
                MaxProfit = CurrentProfit;
            }
            if(prices[i] < InitialPrice){
                InitialPrice = prices[i];
            }
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        Best_Time_To_BuySell_Stock_121 cons = new Best_Time_To_BuySell_Stock_121();

        int[] arr = {7,1,5,3,6,4};

//        int res = cons.bruteForce(arr);
        int res2 = cons.efficient(arr);

        System.out.println(res2);
    }
}
