package CodeSolving_DSA;

public class IntegerToRoman {
    public String intToRoman(int num) {

        int i;
        String roman = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman = roman + romanLetters[i];
                num = num - values[i];
            }
        }
        return roman;
    }

    public static void main(String[] args) {

        IntegerToRoman obj = new IntegerToRoman();

        int input = 2967;

        String result = obj.intToRoman(input);

        System.out.println(result);
    }
}
