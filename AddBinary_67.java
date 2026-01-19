package CodeSolving_DSA;

public class AddBinary_67 {

    //brute-force approach
    public String approach1(String a, String b){
        long num1 = 0;
        for(int i=0; i<a.length(); i++){
            num1 = num1 * 2 +(a.charAt(i) - '0');
        }

        long num2 = 0;
        for(int i=0; i<b.length(); i++){
            num2 = num2 * 2 + (b.charAt(i) - '0');
        }

        long sum = num1 + num2;

        if(sum < 0) return "0";

        StringBuilder sb = new StringBuilder();
        while(sum > 0){
            sb.append(sum % 2);
            sum /= 2;
        }
        return sb.reverse().toString();
    }


    //Efficient approach
    public String approach2(String a, String b){
        long i = a.length() - 1;
        long j = b.length() - 1;

        int carry = 0;

        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0){
            int sum = carry;

            if(i>=0){
                sum += a.charAt((int) i) - '0';
                i--;
            }
            if(j>=0){
                sum += a.charAt((int) j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum/2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "103";
        String b = "11";

        AddBinary_67 ab = new AddBinary_67();

        System.out.println("The binary addition of approach1 is: " + ab.approach1(a,b));
//        System.out.println("The binary addition of approach2 is: " + ab.approach2(a,b));
    }
}
