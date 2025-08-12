/* Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace
and initial word order.
Example 1:      Input: s = "Let's take LeetCode contest"            Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:      Input: s = "Mr Ding"                                Output: "rM gniD"
 */

package programs.arrayString;

public class ReverseWordsInStringII {

    public static String reverseWords(String s){
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            String word = words[i];
            for(int j=word.length()-1; j>=0; j--){
                sb.append(word.charAt(j));
            }
            if(i != words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){

        String s1 = "Let's take LeetCode contest";
        System.out.println("Output is : " + reverseWords(s1));

        String s2 = "Mr Ding";
        System.out.println("Output is : " + reverseWords(s2));
    }
}
