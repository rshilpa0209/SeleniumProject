/* We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:      Input: word = "USA"         Output: true
Example 2:      Input: word = "FlaG"        Output: false
*/

package programs.arrayString;

public class DetectCapital {

    public static boolean detectCapitalUse(String word){
        int capitalCount = 0;
        for(char c : word.toCharArray()){
            if(Character.isUpperCase(c)){
                capitalCount++;
            }
        }
        if(capitalCount==word.length() || capitalCount==0 || (capitalCount==1 && Character.isUpperCase(word.charAt(0)))){
            return true;
        }
        return false;
        //return capitalCount==word.length() || capitalCount==0 || (capitalCount==1 && Character.isUpperCase(word.charAt(0)))
    }

    public static void main(String[] args){

        String word1= "USA";
        System.out.println("Output is : " + detectCapitalUse(word1));

        String word2 = "FlaG";
        System.out.println("Output is : " + detectCapitalUse(word2));

        String word3 = "Capital";
        System.out.println("Output is : " + detectCapitalUse(word3));

        String word4 = "capital";
        System.out.println("Output is : " + detectCapitalUse(word4));

        String word5 = "capiTaL";
        System.out.println("Output is : " + detectCapitalUse(word5));

    }
}
