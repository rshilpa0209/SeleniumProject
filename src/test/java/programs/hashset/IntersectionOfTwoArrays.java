/* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:      Input: nums1 = [1,2,2,1], nums2 = [2,2]         Output: [2]
Example 2:      Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]     Output: [9,4]
Explanation: [4,9] is also accepted.
 */

package programs.hashset;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for(int num: nums2){
            if(set.contains(num)){
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int i = 0;
        for(int num : resultSet){
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println("Intersection of arrays is : " + Arrays.toString(intersection(nums1, nums2)));

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        System.out.println("Intersection of arrays is : " + Arrays.toString(intersection(nums3, nums4)));

    }
}
