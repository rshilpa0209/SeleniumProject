/* You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case-sensitive, so "a" is considered a different type of stone from "A".
Example 1:      Input: jewels = "aA", stones = "aAAbbbb"            Output: 3
Example 2:      Input: jewels = "z", stones = "ZZ"                  Output: 0
*/

package programs.hashmap;

import java.util.HashMap;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<stones.length(); i++){
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0)+1 ) ;
        }

        int jewelsCountInStones = 0;
        for(char c : jewels.toCharArray()){
            if(map.containsKey(c)) {
                jewelsCountInStones = jewelsCountInStones + map.get(c);
            }
        }
        return jewelsCountInStones;
    }

    public static void main(String[] args){

        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println("Output is : " + numJewelsInStones(jewels1, stones1));

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println("Output is : " + numJewelsInStones(jewels2, stones2));

    }
}
