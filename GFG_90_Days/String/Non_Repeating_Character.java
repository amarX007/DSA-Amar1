package CodeSolving_DSA.GFG_90_Days.String;

public class Non_Repeating_Character {
    public static char bruteForce (String s) {
        int n = s.length();

        for (int i=0; i<n; i++) {
            boolean isRepeating = false;

            for (int j=0; j<n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) return s.charAt(i);
        }
        return '$';
    }

    public static void main(String[] args) {
         String words = "racecar";

         String result = String.valueOf(bruteForce(words));

        System.out.println(result);
    }
}
