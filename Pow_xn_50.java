package CodeSolving_DSA;

public class Pow_xn_50 {

    //Brute-force1 (Not usable for edge cases, like -ve numbers)
    public double approach1(double x, int n){
        double result = 1;
        for (long i=0; i<n; i++){
            result = (result * x);
        }
        return result;
    }

    //Brute-force2(Usable and edge cases are handled, till not for online platforms)
    public double approach2(double x, int n){

        //edge case
        if (n == 0) return 1;

        //overflow avoiding for Integer.MIN_VALUE
        long pow = n;
        if (pow < 0){
            x = 1/x;
            pow = -pow;
        }

        double result = 1;
        for (int i=0; i<pow; i++){
            result *= x;
        }
        return result;
    }

    public double approach3(double x, int n){
        //edge case
        if(n == 0) return 1;

        //overflow avoiding
        long power = n;
        if(power < 0){
            x = 1/x;
            power = - power;
        }

        double result = 1;

        while(power > 0){
            if(power % 2 == 1){
                //use x once
                result *= x;
            }

            //square the base
            x *= x;

            //reduce power
            power = power/2;
        }
        return result;
    }



    public static void main(String[] args) {
        Pow_xn_50 pw = new Pow_xn_50();

        System.out.println("Answer of approach1 is: " + pw.approach1(4,2));
        System.out.println("Answer of approach2 is: " + pw.approach2(2, -3));
        System.out.println("Answer of approach2 is: " + pw.approach3(4, 2));
    }
}
