package CodeSolving_DSA;

public class MaxConsOnes_485 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,0,1,1,1};
        System.out.println("Maximum consecutive numbers segment available in array is: " + MaxCount(arr));
    }

    public static int MaxCount(int [] arr) {
        int current_digit = 0;  //initializing  the current array value as '0'
        int max_digit = 0; //taking the variable for update

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                current_digit++; //if there is '1', then current will be increased
                max_digit = current_digit; //store the value

            } else {
                current_digit = 0; //if zero's found, reset the loop
            }
        }
        return max_digit;
    }
}
