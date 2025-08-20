package programs.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {

    public static void findFirstNonRepeatingCharacter(String input){

        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
    }

    public static void main(String[] args) {
        String input1 = "aaabbpcccq";
        findFirstNonRepeatingCharacter(input1);

        String input2 = "ptsfdrtttpsf";
        findFirstNonRepeatingCharacter(input2);



    }
}
