package CodeSolving_DSA;

import java.util.Scanner;

public class Reverse_Integer_7 {
    public static void main(String[] args) {

        /*long n = 12346789005L;
        System.out.println("Before reversing: " + n);

        boolean negative = n < 0;
        long num = Math.abs((long)(n));

        String s = Long.toString(num);
        String reverse = "";

        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }

        long result = Long.parseLong(reverse);
        System.out.println("After reversing: "+ (negative ? -result : result));*/

        //EFFICIENT
        /*long n = 12346789005L;
        System.out.println("Before reversing: " + n);

        boolean negative = n < 0;
        long num = Math.abs((long)(n));

        String s = Long.toString(num);
        StringBuilder reverse = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }

        long result = Long.parseLong(reverse.toString());
        System.out.println("After reversing: "+ (negative ? -result : result));*/

        //OPTIMAL
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n = sc.nextInt();

        System.out.println("Before rev = " + n);
        int rev = 0;
        while(n!=0){
            int digit = n % 10;
            n /= 10;

            //stack-overflow check (online platform ready)
            if(rev > Integer.MAX_VALUE /10){
                System.out.println(0);
                return;
            }

            if(rev < Integer.MIN_VALUE /10){
                System.out.println(0);
                return;
            }

            rev = rev * 10 + digit;
        }
        System.out.print("After reversing= "+ rev);
        sc.close();
    }
}

