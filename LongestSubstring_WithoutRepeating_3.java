package CodeSolving_DSA;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring_WithoutRepeating_3 {

    //brute-force approach
    /*
    * T.C - O(n3)
    * S.C - O(n) - TAKING NO EXTRA SPACES
    */
    public int approach1(String s){
        int max = 0;

        for(int i = 0; i<s.length(); i++){
           for(int j = i; j<s.length(); j++){

               boolean isUnique = true;
               for(int k=i; k<j; k++){
                   if(s.charAt(k) == s.charAt(j)){
                       isUnique = false;
                       break;
                   }
               }
               if (isUnique){
                   max = Math.max(max, j-i+1);
               }else {
                   break;
               }
            }
        }
        return max;
    }

    //better approach
    /*
    * T.C - */
    public int approach2(String s){
        HashSet<Character> st = new HashSet<>();

        int max = 0;
        int left = 0;
        int right = 0;

        for(right=0; right<s.length(); right++){
            char current = s.charAt(right);

            while (st.contains(current)){
                st.remove(s.charAt(left));
                left++;
            }

            st.add(current);
            max = Math.max(max, right-left+1);
        }
        return max;
    }

    //efficient approach
    public int approach3(String s){
        Set<Character> st = new HashSet<>();

        int right = 0;
        int left = 0;
        int n = s.length();
        int max = 0;

        for (right=0; right<n; right++){
            while (st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }

            st.add(s.charAt(right));
            max = Math.max(max, right-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstring_WithoutRepeating_3 ls = new LongestSubstring_WithoutRepeating_3();

        System.out.println(ls.approach1("abcabcbb"));
        System.out.println(ls.approach2("abba"));
        System.out.println(ls.approach3("abcd"));
    }
}
