package CodeSolving_DSA.LeetCode.Math;

public class Smallest_DivisibleDigit_Product1 {

    public static int verifyProduct_helper(int num) {
        // handle edge case - if value of num is 0
        if (num == 0) {
            return 0;
        }

        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }
        return product;
    }

    public static int calculateDigit (int n, int t) {
        while (true) {
            if (verifyProduct_helper(n) % t == 0) {
                return n;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        int n = 15;
        int t = 3;

        System.out.println("The output will be: " + calculateDigit(n,t));
    }
}
