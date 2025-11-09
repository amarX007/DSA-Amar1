package CodeSolving_DSA;

//import HashMap.HashMap1;

 public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] aar = {4, 1, 2, 1, 2};
        System.out.println("The single digit number available in array is: " + SingleNumber(aar));

    }

    public static int SingleNumber(int[] arr) {
        int n = arr.length;
        // Brute-force approach
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;

        // Efficient approach using XOR
        /*int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= arr[i];
        }
        return result;*/


        //Better
        /*HashMap<Integer, Integer>hm = new HashMap<>();

        for(int i = 0; i<n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        for(int i = 0; i<n; i++){
            if(hm.get(arr[i]) == 1){
                return  arr[i];
            }
        }
        return -1;*/
    }

}
