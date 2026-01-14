package CodeSolving_DSA;

public class RomanToInteger_13 {
    static int value (char c){
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:throw new IllegalArgumentException("Invalid roman letter");
        }
    }
    public int romanToInteger(String s) {
        int result = 0;
        int prev = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            int curr = value(s.charAt(i));

            if(curr < prev){
                result = result - curr;
            }else {
                result = result + curr;
            }

            prev = curr;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "XI";
        RomanToInteger_13 es = new RomanToInteger_13();

        int ans = es.romanToInteger(s);
        System.out.println(ans);
    }
}
