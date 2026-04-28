package CodeSolving_DSA.LeetCode.Array_String;

public class Longest_PalindromicSubstring_5 {
    private boolean isPalindrome(String s, int l, int r) {
        while (l<r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public String bruteForce(String s) {
        String answer = "";

        for (int i=0; i<s.length(); i++) {
            for (int j=i; j<s.length(); j++) {
                if (isPalindrome(s, i, j) && (j-i+1 > answer.length())) {
                    answer = s.substring(i, j+1);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "addad";

        Longest_PalindromicSubstring_5 lp = new Longest_PalindromicSubstring_5();

        String ans = lp.bruteForce(str);
        System.out.println(ans);
    }

}