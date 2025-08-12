/* Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters
from magazine and false otherwise. Each letter in magazine can only be used once in ransomNote.
Example 1:      Input: ransomNote = "a", magazine = "b"         Output: false
Example 2:      Input: ransomNote = "aa", magazine = "ab"       Output: false
Example 3:      Input: ransomNote = "aa", magazine = "aab"      Output: true
*/

package programs.hashmap;

import java.util.HashMap;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for(char c : magazine.toCharArray()){
            magazineMap.put(c, magazineMap.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> ransomMap = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            ransomMap.put(c, ransomMap.getOrDefault(c, 0)+1);
        }

        for(char c : ransomMap.keySet()){
            if(!magazineMap.containsKey(c)  || ransomMap.get(c) > magazineMap.get(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Output is : " + canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Output is : " + canConstruct(ransomNote2, magazine2));

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Output is : " + canConstruct(ransomNote3, magazine3));

    }
}
