package programs.misc;

import java.util.HashMap;

public class ValidAnagram2 {
    public static boolean validAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        boolean anagram = false;
        HashMap<Character, Integer> map1 = addToMap(s);
        HashMap<Character, Integer> map2 = addToMap(t);
        if(map1.equals(map2)){
            anagram =  true;
        }

        return anagram;
    }

    static HashMap<Character, Integer> addToMap(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        return map;
    }

    public static void main(String[] args){

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Valid Anagram: " + validAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Valid Anagram: " + validAnagram(s2, t2));

        String s3 = "qwewret";
        String t3 = "ghgjj";
        System.out.println("Valid Anagram: " + validAnagram(s3, t3));

        String s4 = "classmate";
        String t4 = "teamslacs";
        System.out.println("Valid Anagram: " + validAnagram(s4, t4));
    }
}
