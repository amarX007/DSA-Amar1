package CodeSolving_DSA.GeeksForGeeks.Array_String;

public class MaximumOccurred_Integer {
    public int optimalSol(int []L, int []R) {
        int max = R[0];
        for (int i=1; i<R.length; i++) {
            max = Math.max(max, R[i]);
        }

        int []freq = new int[max+2];

        for (int i=0; i<L.length; i++) {
            freq[L[i]]++;
            freq[R[i]+1]--;
        }

        for (int i=1; i<freq.length; i++) {
            freq[i] += freq[i-1];
        }

        int finalValue = 0;
        int maxFreq = 0;

        for (int i=1; i<freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                finalValue = i;
            }
        }
        return finalValue;
    }

    public int bruteForce(int []L, int []R) {
        int max = R[0];
        for (int i=1; i<R.length; i++) {
            max = Math.max(max, R[i]);
        }

        int []freq = new int[max+1];

        for (int i=0; i<L.length; i++) {
            for (int j=L[i]; j<=R[i]; j++) {
                freq[j]++;
            }
        }

        int finalValue = 0;
        int maxFreq = 0;

        for (int i=1; i<freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                finalValue = i;
            }
        }
        return finalValue;
    }



    public static void main(String[] args) {
        MaximumOccurred_Integer cons = new MaximumOccurred_Integer();

        int []l = {1,4,3,1};
        int []r = {15,8,5,4};

        int ans = cons.bruteForce(l,r);
        int ans2 = cons.optimalSol(l,r);

        System.out.println(ans2);

    }
}
