package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

    String input = "ABABCCD";
    //ABCD

    Map<Character, Integer> map = new LinkedHashMap<>();
    for(char c : input.toCharArray()){
        map.put(c, map.getOrDefault(c,0)+1);

    }

        System.out.println(Arrays.toString(map.keySet().toArray()));


}

}
