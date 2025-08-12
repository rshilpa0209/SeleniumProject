/* Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:      Input: s = "Hello World"                        Output: 5
Explanation: The last word is "World" with length 5.
Example 2:      Input: s = "   fly me   to   the moon  "        Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:      Input: s = "luffy is still joyboy"              Output: 6
Explanation: The last word is "joyboy" with length 6.
*/
package programs.arrayString;

public class LengthOfLastWord {

    public static int findLengthOfLastWord(String s){

        // Trim the string to remove leading and trailing spaces
        s= s.trim();
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }

    public static void main(String[] args){
        String s1 = "Hello World";
        System.out.println("Length of last word in String " + s1 + " is " + findLengthOfLastWord(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Length of last word in String " + s1 + " is " + findLengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println("Length of last word in String " + s1 + " is " + findLengthOfLastWord(s3));

    }
}
