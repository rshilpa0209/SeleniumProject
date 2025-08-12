/*  Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:      Input: x = 121      Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:      Input: x = -121     Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:      Input: x = 10       Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

package programs.twoPointers;

public class ValidPalindrome2 {

    public static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){

        int x1 = 121;
        System.out.println("Is " + x1 + " palindrome: " + isPalindrome(x1));
        int x2 = -121;
        System.out.println("Is " + x1 + " palindrome: " + isPalindrome(x2));
        int x3 = 10;
        System.out.println("Is " + x1 + " palindrome: " + isPalindrome(x3));

    }
}
