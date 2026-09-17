package CodeSolving_DSA.GFG_90_Days.String;

public class Implement_Atoi {
    public static int myAtoi (String s) {
        if (s == null) return 0;
        s = s.trim();

        int sign = 1;
        int n = s.length();
        int i = 0;
        int num = 0;

        // check for sign
        if (i <n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // traverse the string
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;


            if (num > Integer.MAX_VALUE / 10 || num == Integer.MAX_VALUE/ 10 && digit > 7) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            i++;
        }

        return sign * num;
    }

    public static void main(String[] args) {
        String s =" 1231231231311133";

        int res = myAtoi(s);

        System.out.println(res);
    }
}
