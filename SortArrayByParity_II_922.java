package CodeSolving_DSA;

public class SortArrayByParity_II_922 {

    //Brute force approach
    /*public static int [] SortArray(int []arr) {
        //taking n as length of the array
        int n = arr.length;
        int[] result = new int[n]; //storing the values of even & odd in another empty array.

        //initializing even & odd number's values
        int even = 0;
        int odd = 1;

        //loop through the array
        for(int i = 0; i<n; i++){
            if(arr[i] % 2 == 0){ //condition checking if the number is even
                result[even] = arr[i]; //storing the value in new array

                //increasing the value of even
                even += 2;
            }
            else{ //condition checking if the number is odd
                result[odd] = arr[i]; //storing the value in new array

                //increasing the value of odd
                odd += 2;
            }
        }
        return result; //returning the new stored array
    }*/

/*--------------------------------------------------------------------------------------------------------------------*/

    //Efficient approach
    public static int [] SortArray(int [] arr){

        //initializing even & odd number's values
        int even = 0;
        int odd = 1;
        int n = arr.length;

        //looping through whole array & checking if array size is smaller than even and odd.
        while(even < n && odd < n){

            //if even index has odd number
            if(arr[even] % 2 != 0){

                //finding the next odd index using an even number
                while(odd <n && arr[odd] % 2 != 0){
                    odd += 2; //increasing odd index's position to next two position
                }

                //swapping wrong even & odd indexes
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
            }
            even += 2; //move to next even index
        }
        return arr; //returning array element to main
    }


    //Main method to compile & display the output.
    public static void main(String[] args) {
        int [] arr = {4,2,5,7};

        int [] result = SortArray(arr);

        System.out.println("Sorted numbers are: ");
        for(int num : result){
            System.out.print(num + " ");
        }

    }
}
