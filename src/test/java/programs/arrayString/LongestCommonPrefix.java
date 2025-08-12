/* Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:      Input: strs = ["flower","flow","flight"]            Output: "fl"
Example 2:      Input: strs = ["dog","racecar","car"]               Output: ""
Explanation: There is no common prefix among the input strings.
 */

package programs.arrayString;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0 ) return "";

        int minLength = Integer.MAX_VALUE;
        for(String str : strs){
            minLength = Math.min(minLength, str.length());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<minLength; i++){
            char currentChar = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i) != currentChar){
                    return sb.toString();
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }

    public static void main(String[] args){

        String[] strs1 = {"flower","flow","flight"};
        System.out.println("Longest common prefix is : " + longestCommonPrefix(strs1));

        String[] strs2 = {"dog","racecar","car"};
        System.out.println("Longest common prefix is : " + longestCommonPrefix(strs2));

        String[] strs3 = {};
        System.out.println("Longest common prefix is : " + longestCommonPrefix(strs3));

        String[] strs4 = {"flower","","flight"};
        System.out.println("Longest common prefix is : " + longestCommonPrefix(strs4));


    }
}
