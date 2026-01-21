package CodeSolving_DSA;

public class Reverse_String_344 {

    //Brute-force approach
    public void approach1(char[] s){
        StringBuilder sb = new StringBuilder();

        for(int i = s.length - 1; i>=0; i--){
            sb.append(s[i]);
        }
    }

    //efficient approach
    /*
    * T.C - O(n)
    * S.C - 0(1)
    */
    public void approach2(char []s){
        int i=0;
        int j=s.length - 1;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] n = {'g','o','o','d'};

        Reverse_String_344 rs = new Reverse_String_344();

        rs.approach1(s);
        for(char S : s){
            System.out.print(S);
        }
        System.out.println();

        rs.approach2(n);
        for(char N : n){
            System.out.print(N);
        }

    }
}
