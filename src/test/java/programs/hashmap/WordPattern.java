/* Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.

Example 1:      Input: pattern = "abba", s = "dog cat cat dog"      Output: true
Explanation: The bijection can be established as: 'a' maps to "dog". 'b' maps to "cat".
Example 2:      Input: pattern = "abba", s = "dog cat cat fish"     Output: false
Example 3:      Input: pattern = "aaaa", s = "dog cat cat dog"      Output: false
Example 4:      Input: pattern = "abba", s = "dog dog dog dog"      Output: false
*/
package programs.hashmap;

import java.util.HashMap;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s){
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if(pattern.length()!= words.length) return false;
        int index =0;
        while(index<pattern.length()){
            if(map.containsKey(pattern.charAt(index))){
                if(!(map.get(pattern.charAt(index)).equals(words[index]))){
                    return false;
                }
            }
            else{
                if(!(map.values().contains(words[index]))) {
                    map.put(pattern.charAt(index), words[index]);
                }
                else return false;
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args){

        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        System.out.println("Output is : " + wordPattern(pattern1, s1));

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        System.out.println("Output is : " + wordPattern(pattern2, s2));

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        System.out.println("Output is : " + wordPattern(pattern3, s3));

        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        System.out.println("Output is : " + wordPattern(pattern4, s4));
    }
}
