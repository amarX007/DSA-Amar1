package CodeSolving_DSA;

public class Valid_Palindrome_125 {

    //Brute-force approach - Building String & reverse
    /*
    * T.C = O(n)
    * S.C = 0(n) extra space.
    */
    public boolean approach1(String s){
        StringBuilder code = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                code.append(Character.toLowerCase(c));
            }
        }

        String f = code.toString();
        String b = code.reverse().toString();

        return f.equals(b);
    }



    //Efficient approach
    /*
    * T.C = 0(n)
    * S.C = 0(1)
    */
    public boolean approach2(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Drord";

        Valid_Palindrome_125 P = new Valid_Palindrome_125();

        String result1 = String.valueOf(P.approach1(s));
        String result2 = String.valueOf(P.approach2(s));

        System.out.println(result1);
    }
}
