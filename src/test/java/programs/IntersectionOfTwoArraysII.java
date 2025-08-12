/* Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.
Example 1:      Input: nums1 = [1,2,2,1], nums2 = [2,2]             Output: [2,2]
Example 2:      Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]         Output: [4,9]
Explanation: [9,4] is also accepted.
 */

package programs;

import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static void intersection(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(map.get(num), 0)+1);
        }

        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for(int num: nums2){
            if(map.containsKey(num)){

            }
        }



    }

    public static void main(String[] args){

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        //System.out.println("Intersection of arrays is : " + Arrays.toString(intersection(nums1, nums2)));


        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        //System.out.println("Intersection of arrays is : " + Arrays.toString(intersection(nums3, nums4)));
    }
}
