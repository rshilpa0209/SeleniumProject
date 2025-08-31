/*
Find the last repeated character in a string.
 */

package programs.arrayString;

import java.util.*;

public class FindLastRepeatedCharacter {

    public static void findLastRepeatedCharacterInString(String s) {
        char last_char = 0;

//        Using Map
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            if (map.containsKey(c)) {
//                last_char = c;
//            } else {
//                map.put(c, 0);
//            }
//        }
        //Using Set
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                last_char = c;
            }
            else{
                set.add(c);
            }
        }
        System.out.println("Last repeated character is " + last_char);
    }


    public static void main(String[] args) {

        String s1 = "abcbkpyfcjjbca";
        findLastRepeatedCharacterInString(s1);

        String s2 = "abcbkpyfcjjbcatyn";
        findLastRepeatedCharacterInString(s2);


    }
}
