/* Given two binary strings a and b, return their sum as a binary string.
Example 1:      Input: a = "11", b = "1"            Output: "100"
Example 2:      Input: a = "1010", b = "1011"       Output: "10101"
*/

package programs.misc;

import java.math.BigInteger;

public class AddBinary {

    public static String addBinaryUsingInbuiltFn(String a, String b){
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);

        return Integer.toBinaryString(num1+num2);
    }

    public static String addBinaryUsingBigInteger(String a, String b){
        BigInteger num1 = new BigInteger(a,2);
        BigInteger num2 = new BigInteger(b,2);
        BigInteger sum = num1.add(num2);

        return sum.toString(2);
    }

    //This implementation won’t work for very large binary strings (e.g., 64+ bits) due to int limits.
    public static String addBinary(String a, String b){
        int num1 = convertBinaryToDecimal(a);
        int num2 = convertBinaryToDecimal(b);
        int num = num1 + num2;

        if (num ==0) return "0";

        String s = "";
        while(num>0){
            s = num%2 + s;
            num = num/2;
        }
        return s;
    }

    private static int convertBinaryToDecimal(String s){
        int num=0;
        for(int i=0; i<s.length(); i++){
            num = num*2 + (s.charAt(i)-'0');
        }

        /* for(int i=s.length()-1, j=0; i>=0 && j<s.length(); i--,j++){
            num = num + (s.charAt(i)-'0') * (int)Math.pow(2,j);
        } */

        return num;
    }

    public static void main(String[] args){

        String a1 = "11";
        String b1 = "1";
        System.out.println("Output is: " + addBinary(a1, b1));

        String a2 = "1010";
        String b2 = "1011";
        System.out.println("Output is: " + addBinary(a2, b2));

        String a3 = "1111";
        String b3 = "11";
        System.out.println("Output is: " + addBinary(a3, b3));

        String a4 = "";
        String b4 = "";
        System.out.println("Output is: " + addBinary(a4, b4));
    }
}
