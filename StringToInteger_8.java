package CodeSolving_DSA;

import java.util.Scanner;

public class StringToInteger_8 {
    public static int Atoi(String s) {
        //initializing some values
        int i = 0;
        int n = s.length();
        int sign = +1;
        int ans = 0;

        //if string is null
        if(s == null) {
            return 0;
        }

        //skip the leading spaces
        s = s.trim();

        //in case String length is 1
        if(n == 0) {
            return 0;
        }

        //if index 0 has '-ve'
        if(s.charAt(0) == '-') sign = -1;

        //handing the max & min properties
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;

        //initializing the starting pointer
        i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;

        while(i<n){
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + s.charAt(i) - '0';

            //checking condition
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;

            i++;
        }
        return (int)(sign*ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String input = sc.nextLine();

        int output = Atoi(input);
        System.out.println("Converted integer: " + output);

        sc.close();
    }
}
