/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:      Input: nums = [2,2,1]           Output: 1
Example 2:      Input: nums = [4,1,2,1,2]       Output: 4
Example 3:      Input: nums = [1]               Output: 1
*/

package programs.hashmap;

import org.testng.annotations.Test;
import java.util.HashMap;

public class FindSingleNumberFromArray {

    public int findSingleNumber(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : map.keySet()){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }

    @Test
    public void singleNumber(){
        int[] nums1 = {2,2,5};
        int singleNumber1 = findSingleNumber(nums1);
        System.out.println("The element which appears only once is " + singleNumber1);

        int[] nums2 = {4,1,2,1,2};
        int singleNumber2 = findSingleNumber(nums2);
        System.out.println("The element which appears only once is " + singleNumber2);

        int[] nums3 = {1};
        int singleNumber3 = findSingleNumber(nums3);
        System.out.println("The element which appears only once is " + singleNumber3);
    }
}