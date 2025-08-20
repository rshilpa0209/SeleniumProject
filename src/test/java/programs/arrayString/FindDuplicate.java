/* Given an array of integers nums containing n+1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
Example:  Input: nums = [1,3,4,2,2]    Output: 2
*/
package programs.arrayString;

import java.util.HashMap;

public class FindDuplicate {

    public static int findDuplicateNumberInArray(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num : map.keySet()){
            if(map.get(num)>1){
                return num;
            }
        }
        return -1;
    }



    public static void main(String[] args){

        int[] nums1 ={1,3,4,2,2};
        System.out.println("Output is : " + findDuplicateNumberInArray(nums1));

        int[] nums2 ={1,3,4,7,2};
        System.out.println("Output is : " + findDuplicateNumberInArray(nums2));

        int[] nums3 ={1,7,4,7,2};
        System.out.println("Output is : " + findDuplicateNumberInArray(nums3));

    }
}
