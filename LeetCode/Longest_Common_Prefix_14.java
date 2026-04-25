package CodeSolving_DSA.LeetCode;

public class Longest_Common_Prefix_14 {
    public String ordinary(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s2.charAt(i))) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            res = ordinary(res, strs[i]);
            if (res.isEmpty()) break;
        }
        return res;
    }

    public static void main(String[] args) {
        Longest_Common_Prefix_14 obj = new Longest_Common_Prefix_14();

        String[] input = {"Car", "carr", "ca"};

        String result = obj.longestCommonPrefix(input);

        System.out.println("Longest common prefix: " + result);
    }
}
