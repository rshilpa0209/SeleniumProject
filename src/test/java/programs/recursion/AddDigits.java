/* Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
Example 1:      Input: num = 38     Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
Example 2:      Input: num = 0      Output: 0
*/

package programs.recursion;

public class AddDigits {
    public static int addDigits1(int num){
        int sum = 0;
        if(num<10) return num;
        else{
            sum = num/10 + num%10;
        }
        return addDigits1(sum);
    }

    public static int addDigits(int num){
        if(num<10) return num;
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        return addDigits(sum);
    }

    public static void main(String[] args){
        int num1 = 38;
        System.out.println("Output is: " + addDigits(num1));

        int num2 = 0;
        System.out.println("Output is: " + addDigits(num2));

        int num3 = 791;
        System.out.println("Output is: " + addDigits(num3));

        int num4 = 9999;
        System.out.println("Output is: " + addDigits(num4));

        int num5 = 1000000001;
        System.out.println("Output is: " + addDigits(num5));

    }
}
