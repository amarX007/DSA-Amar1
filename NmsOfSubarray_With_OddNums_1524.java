package CodeSolving_DSA;

public class NmsOfSubarray_With_OddNums_1524 {
    public static int subArray(int []arr){

        long res = 0;
        long even = 1;
        long odd = 0;
        long prefix = 0;
        long mod = 1_000_000_007;

        for (int i=0; i<arr.length; i++){
            prefix = prefix + arr[i];

            if (prefix % 2 == 0){
                res = res + odd;
                even++;
            }else {
                res = res + even;
                odd++;
            }

            res = res % mod;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int []arr = {3,4,5,7};

        int res = subArray(arr);

        System.out.println(res);
    }
}
