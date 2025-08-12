/*  Given an array nums of size n, return the majority element.
The majority element is the element that appears more than (n / 2) times. You may assume that the majority element always exists in the array.
Example 1:      Input: nums = [3,2,3]            Output: 3
Example 2:      Input: nums = [2,2,1,1,1,2,2]    Output: 2
*/


package programs.hashmap;

import java.util.HashMap;

public class MajorityElement {
    public static int findMajorityElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
            /* use map.getOrDefault(num, 0) instead of if-else
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            } */
            if(map.get(num)>(arr.length/2)){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] nums1 = {3,2,3};
        System.out.println("Majority element is: " + findMajorityElement(nums1));

        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println("Majority element is: " + findMajorityElement(nums2));

        int[] nums3 = {1};
        System.out.println("Majority element is: " + findMajorityElement(nums3));

        int[] nums4 = {1,1,1,2,2,2};
        System.out.println("Majority element is: " + findMajorityElement(nums4));
    }
}
