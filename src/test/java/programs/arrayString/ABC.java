package programs.arrayString;

import java.util.LinkedHashMap;
import java.util.Map;

public class ABC {

        public static void main(String[] args) {

            String input = "apple";
            //output: a1p2l1e1

            Map<Character, Integer> map = new LinkedHashMap<>();
            for(char c : input.toCharArray()){
                map.put(c, map.getOrDefault(c,0)+1);
            }

            StringBuilder output = new StringBuilder();
            for(char c: map.keySet()){
                output.append(c);
                output.append(map.get(c));
            }

            System.out.println(output);

        }
}
