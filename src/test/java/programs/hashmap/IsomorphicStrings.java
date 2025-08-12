/* Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
Example 1:      Input: s = "egg", t = "add"         Output: true
Explanation: The strings s and t can be made identical by: Mapping 'e' to 'a'. Mapping 'g' to 'd'.
Example 2:      Input: s = "foo", t = "bar"         Output: false
Explanation: The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
Example 3:      Input: s = "paper", t = "title"     Output: true
 */

package programs.hashmap;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        int index = 0;
        while(index < s.length()){
            if(map.containsKey(s.charAt(index))){
                if(!(map.get(s.charAt(index)).equals(t.charAt(index)))){
                    return false;
                }
            }
            else{
                if(!(map.values().contains(t.charAt(index)))){
                    map.put(s.charAt(index), t.charAt(index));
                }
                else return false;
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args){

        String s1 = "egg";
        String t1 = "add";
        System.out.println("Isomorphic : " + isIsomorphic(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Isomorphic : " + isIsomorphic(s2, t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println("Isomorphic : " + isIsomorphic(s3, t3));

    }
}
