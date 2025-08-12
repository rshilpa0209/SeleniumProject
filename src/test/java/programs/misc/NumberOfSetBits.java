/* Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
Example 1:      Input: n = 11               Output: 3
Explanation: The input binary string 1011 has a total of three set bits.
Example 2:      Input: n = 128              Output: 1
Explanation: The input binary string 10000000 has a total of one set bit.
Example 3:      Input: n = 2147483645       Output: 30
Explanation: The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
 */


package programs.misc;

public class NumberOfSetBits {

    public static int hummingWeight(int num){
        int count=0;
        while(num>0){
            if(num%2==1){
                count++;
            }
            num=num/2;
        }
        return count;
    }

    public static void main(String[] args){

        int num1 = 11;
        System.out.println("Number of set bits: " +  hummingWeight(num1));

        int num2 = 128;
        System.out.println("Number of set bits: " +  hummingWeight(num2));

        int num3 = 2147483645;
        System.out.println("Number of set bits: " +  hummingWeight(num3));

    }


}
