/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:      Input: nums = [1,2,3,1]                     Output: true
Explanation: The element 1 occurs at the indices 0 and 3.
Example 2:      Input: nums = [1,2,3,4]                     Output: false
Explanation: All elements are distinct.
Example 3:      Input: nums = [1,1,1,3,3,4,3,2,4,2]         Output: true
*/

package programs.hashmap;

import org.testng.annotations.Test;
import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        for(int num : nums){
            if(map.containsKey(num)) {
                flag = true;
                break;
            }
            else{
                map.put(num, 1);
            }
        }
        return flag;
    }

    @Test
    public void verifyContainsDuplicate(){
       int[] nums1 = {1,2,3,1};
       System.out.println(containsDuplicate(nums1));
       int[] nums2 = {1,2,3,4};
       System.out.println(containsDuplicate(nums2));
       int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
       System.out.println(containsDuplicate(nums3));
    }
}
