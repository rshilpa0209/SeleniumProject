/* Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
Example 1:      Input: n = 1        Output: true
Explanation: 2^0 = 1
Example 2:      Input: n = 16       Output: true
Explanation: 2^4 = 16
Example 3:      Input: n = 3        Output: false
Example 4:      Input: n = 0        Output: false

 */
package programs.recursion;


public class PowerOfTwoUsingRecursion {
    public static boolean isPowerOfTwo(int num){
        if(num==1){
            return true;
        }
        if(num<=0 || num%2!=0){
            return false;
        }
        return isPowerOfTwo(num/2);
    }

    public static void main(String[] args){

        int num1 = 1;
        System.out.println("Is " + num1 + " power of 2 : " + isPowerOfTwo(num1));

        int num2 = 16;
        System.out.println("Is " + num2 + " power of 2 : " + isPowerOfTwo(num2));

        int num3 = 3;
        System.out.println("Is " + num3 + " power of 2 : " + isPowerOfTwo(num3));

        int num4 = 0;
        System.out.println("Is " + num4 + " power of 2 : " + isPowerOfTwo(num4));
    }
}
