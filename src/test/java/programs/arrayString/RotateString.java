/* Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
Example 1:      Input: s = "abcde", goal = "cdeab"              Output: true
Example 2:      Input: s = "abcde", goal = "abced"              Output: false
 */

package programs.arrayString;

public class RotateString {

    public static boolean rotateString(String s, String g){

        if(s.length() != g.length()){
            return false;
        }

        String doubleString = s+s;

        return doubleString.contains(g);
    }

    public static boolean rotateString1(String s, String g){
        if(s.length() != g.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            s = s.substring(1) + s.charAt(0);
            if(s.equals(g)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        String s1 = "abcde";
        String g1 = "cdeab";
        System.out.println(rotateString1(s1,g1));

        String s2 = "abcde";
        String g2 = "abced";
        System.out.println(rotateString1(s2,g2));
    }
}
