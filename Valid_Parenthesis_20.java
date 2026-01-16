package CodeSolving_DSA;

import java.util.Stack;

public class Valid_Parenthesis_20 {
    //Brute-force approach

    public boolean approach1(String s){
        boolean change = true;

        while(change){
            change = false;

            if (s.contains("()")){
                s= s.replace("()", "");
                change = true;
            }
            if (s.contains("{}")) {
                s= s.replace("{}", "");
                change = true;
            }
            if(s.contains("[]")){
                s= s.replace("[]", "");
                change = true;
            }

        }
        return s.isEmpty();
    }

    //Efficient
    public boolean approach2(String s){
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){

            //stack push
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if (st.isEmpty()) return false;

                char up = st.pop();

                if((ch == ')' && up!='(') || (ch == '}' && up!= '{') || (ch == ']' && up!= '[')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    /**/

    public static void main(String[] args) {
        Valid_Parenthesis_20 vp = new Valid_Parenthesis_20();

        System.out.println(vp.approach1("()"));
        System.out.println(vp.approach2("{}"));

    }
}
