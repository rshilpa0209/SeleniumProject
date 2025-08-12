//Remove duplicates from an array
package programs.hashmap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(Arrays.toString(map.keySet().toArray()));
    }
}
