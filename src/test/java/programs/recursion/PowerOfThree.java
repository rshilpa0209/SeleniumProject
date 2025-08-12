/* Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.
Example 1:      Input: n = 27       Output: true
Explanation: 27 = 33
Example 2:      Input: n = 0        Output: false
Explanation: There is no x where 3x = 0.
Example 3:      Input: n = -1       Output: false
Explanation: There is no x where 3x = (-1).
*/
package programs.recursion;

public class PowerOfThree {

    public static boolean isPowerOfThree(int num){
        if(num==1) return true;
        if(num <= 0 || num%3!=0) return false;
        return isPowerOfThree(num/3);
    }

    public static void main(String[] args){

        int num1 = 27;
        System.out.println("Is " + num1 + " power of three : " + isPowerOfThree(num1));

        int num2 = 0;
        System.out.println("Is " + num2 + " power of three : " + isPowerOfThree(num2));

        int num3 = -1;
        System.out.println("Is " + num3 + " power of three : " + isPowerOfThree(num3));

        int num4 = 1;
        System.out.println("Is " + num4 + " power of three : " + isPowerOfThree(num4));

        int num5 = 56;
        System.out.println("Is " + num5 + " power of three : " + isPowerOfThree(num5));

    }

}
