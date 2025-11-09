package CodeSolving_DSA;

public class MissingNumber_268 {
    /* First we have to take a variable name - sum, with the value '0'
    * Then run a for loop from 0 to n(arr.length)
    * then add the values of arr with sum, so we'll get the sum of the array
    * to calculate the actual values of the addition - we have to calculate n*(n+1)/2
    * then we'll do (actual values - sum), so that we get the missing number
    * AT the end return the missing number variable
    * */

    public static void main(String[] args) {
        int [] arr = {0,1,2,4};
        System.out.println(MissingNum(arr));
    }

    public static int MissingNum(int []arr){
        int n = arr.length;
        int sum = 0;
        int MainSum;

        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        MainSum = ((n+1)*n)/2;

        int MissingSum = MainSum - sum;

        return MissingSum;
    }
}
