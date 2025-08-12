/* Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:      Input: n = 19       Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
Example 2:      Input: n = 2        Output: false
 */

package programs.hashset;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappyNumber(int num){
        HashSet<Integer> seen = new HashSet<>();
        while(num !=1 && !seen.contains(num)) {
            seen.add(num);
            int sum = 0;
            while (num > 0) {
                sum = sum + ((num % 10) * (num % 10));
                num = num / 10;
            }
            num = sum;
        }
        return num==1;
    }

    public static void main(String[] args){

        int num1 = 19;
        System.out.println("Output is : " + isHappyNumber(num1));

        int num2 = 2;
        System.out.println("Output is : " + isHappyNumber(num2));

    }


}
