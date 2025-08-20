//Remove duplicates from an array
package programs.hashset;

import java.util.*;

public class RemoveDuplicates {

    public static void removeDuplicatesUsingHashMap(int[] nums){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(Arrays.toString(map.keySet().toArray()));
    }

    public static void removeDuplicatesUsingHashSet(int[] nums){

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        System.out.println(Arrays.toString(set.toArray()));

    }

    public static void main(String[] args){
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicatesUsingHashMap(nums1);
        removeDuplicatesUsingHashSet(nums1);

        int[] nums2 = {1,1,2};
        removeDuplicatesUsingHashMap(nums2);
        removeDuplicatesUsingHashSet(nums2);

    }
}
