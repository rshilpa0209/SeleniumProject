/*  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1: Input: s = "anagram", t = "nagaram" Output: true
Example 2: Input: s = "rat", t = "car" Output: false
*/

package programs;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean checkValidAnagram(String s, String t){

        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        for(char c : s.toCharArray()){
            mapS.put(c, mapS.getOrDefault(c, 0)+1);
        }

        Map<Character, Integer> mapT = new HashMap<>();
        for(char c : t.toCharArray()){
            mapT.put(c, mapT.getOrDefault(c, 0)+1);
        }

        for(char c : s.toCharArray()){
            if(mapS.get(c) != (mapT.get(c))){
                return false;
            }
        }
        return true;
    }

    public static boolean checkValidAnagram2(String s, String t){

        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, map.get(c) -1);
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anaGram";
        String t1 = "nagaram";
        System.out.println(checkValidAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println(checkValidAnagram(s2, t2));

        String s3 = "qwewret";
        String t3 = "ghgjj";
        System.out.println(checkValidAnagram(s3, t3));

        String s4 = "classmate";
        String t4 = "teamslacs";
        System.out.println(checkValidAnagram(s4, t4));

    }
}
