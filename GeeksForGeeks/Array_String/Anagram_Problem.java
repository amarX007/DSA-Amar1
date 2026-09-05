package CodeSolving_DSA.GeeksForGeeks.Array_String;

import java.util.Arrays;

public class Anagram_Problem {
    public static boolean bruteForce (String s1, String s2) {

        // edge case - if length miss-match
        if (s1.length() != s2.length()) {
            return false;
        }

        // convert String to Char Array
        char []arr1 = s1.toCharArray();
        char []arr2 = s2.toCharArray();

        // sort the char arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // compare both of them
        return Arrays.equals(arr1, arr2);
    }

    public static boolean optimalApproach(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int [] freq = new int[26];

        for (int i=0; i<s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i=0; i<s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String arr1 = "vase";
        String arr2 = "save";

        System.out.println(optimalApproach(arr1, arr2));
    }
}
