package CodeSolving_DSA.GeeksForGeeks.Array_String;

public class Add_Binary_String {
    public static String addBinary(String s1, String s2) {

        // initializing both the pointers from the end
        int i = s1.length() - 1;
        int j = s2.length() - 1;

        // taking carry
        int carry = 0;

        // StringBuilder
        StringBuilder sb = new StringBuilder();

        // repeating the loop until both the Strings and carry are gone exhausted
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum = sum + s1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum+= s2.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum/2;
        }

        String res = sb.reverse().toString();

        // remove leading '0' - CP
        int idx = 0;

        while (idx < res.length() - 1 && res.charAt(idx) == '0') {
            idx++;
        }
        return res.substring(idx);
    }

    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        String res = addBinary(s1, s2);

        System.out.println(res  );
    }
}
