package CodeSolving_DSA.GeeksForGeeks.Array_String;

public class Minimum_IncrementOrDouble_OperationsTo_Convert {
    public static int countOperations (int[] arr) {
        int n =  arr.length;

        int decrementCount = 0;
        int totalDivideCount = 0;

        for (int i=0; i<n; i++) {
            int curr = arr[i];
            int divideCount = 0;

            while (curr > 0) {
                if (curr % 2 == 1) {
                    decrementCount++;
                    curr--;
                } else {
                    divideCount++;
                    curr /= 2;
                }
            }
            totalDivideCount = Math.max(totalDivideCount, divideCount);
        }
        return decrementCount + totalDivideCount;
    }

    public static void main(String[] args) {
        int[] arr = {7,8};

        System.out.println("Total operations are: " + countOperations(arr));
    }
}
