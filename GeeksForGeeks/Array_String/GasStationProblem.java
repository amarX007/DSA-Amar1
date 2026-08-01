package CodeSolving_DSA.GeeksForGeeks.Array_String;

public class GasStationProblem {
    public static int bruteForce(int []gas, int []cost) {
        int n = gas.length;

        for (int start = 0; start < n; start++) {
            int curr_petrol = 0;
            int end = start;

            while (true) {
                curr_petrol += (gas[end] - cost[end]);

                if (curr_petrol < 0) {
                    break;
                }

                end = (end + 1) % n;

                if (end == start) return start;
            }
        }
        return -1;
    }

    public static int optimalApproach(int []gas, int []cost) {
        int n = gas.length;

        int curr_petrol = 0;
        int prev_petrol = 0;
        int start = 0;

        for (int i=0; i<n; i++) {
            curr_petrol += (gas[i] - cost[i]);

            if (curr_petrol < 0) {
                start = i+1;
                prev_petrol += curr_petrol;
                curr_petrol = 0;
            }
        }

        if (curr_petrol + prev_petrol >= 0) {
            return start;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int [] gas = {4, 5, 7, 4};
        int [] cost = {6, 6, 3, 5};

        int ans = optimalApproach(gas, cost);

        System.out.println(ans);
    }
}
