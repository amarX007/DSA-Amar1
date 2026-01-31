package CodeSolving_DSA;

public class FindDuplicateNumber_287 {

    /*
    * T.C - O(N)
    * S.C - O(1)
    */
    public int findDup(int [] nums){

        //S1: Detect cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow]; //moves slow 1 step ahead
            fast = nums[nums[fast]]; //moves fast 2 steps ahead
        }while (slow != fast);

        //find cycle entry
        slow = nums[0];

        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public void printArray(int [] num){
        for (int nums : num){
            System.out.print(nums + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] num = {1,2,3,4,4};

        FindDuplicateNumber_287 fd = new FindDuplicateNumber_287();


        System.out.print("Array elements before operations: ");
        fd.printArray(num);

        int duplicateElement = fd.findDup(num);

        System.out.println("Array elements after operation: " + duplicateElement);
    }
}
