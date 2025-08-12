/*Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:      Input: s = "the sky is blue"        Output: "blue is sky the"
Example 2:      Input: s = "  hello world  "        Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:      Input: s = "a good   example"       Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/

package programs.arrayString;

public class ReverseWordsInString {

    public static String reverseWordsInStr(String s){
        s=s.trim();
        String[] arr = s.split("\\s+");
        int size = arr.length;
        String[] rev_arr=  new String[size];
        for(int i=size-1, j=0; i>=0 && j<size; i--,j++){
            rev_arr[j] = arr[i];
        }
        String rev_str = String.join(" ", rev_arr);
        return rev_str;
    }


    public static String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();

        // Split the string by one or more spaces using regex
        String[] words = s.split("\\s+");

        // Use StringBuilder to efficiently reverse and build the result
        StringBuilder reversed = new StringBuilder();

        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args){
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));
       // System.out.println(reverseWordsInStr(s1));

        String s2 = "  hello world  ";
        //System.out.println(reverseWordsInStr(s2));
        System.out.println(reverseWords(s2));

        String s3 = "a good   example";
       // System.out.println(reverseWordsInStr(s3));
        System.out.println(reverseWords(s3));
    }
}
