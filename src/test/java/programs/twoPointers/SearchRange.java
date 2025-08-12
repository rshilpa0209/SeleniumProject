/*  Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.
Example 1:  Input: nums = [5,7,7,8,8,10], target = 8    Output: [3,4]
Example 2:  Input: nums = [5,7,7,8,8,10], target = 6    Output: [-1,-1]
Example 3:  Input: nums = [], target = 0                Output: [-1,-1]
*/

package programs.twoPointers;

import java.util.Arrays;

public class SearchRange {

    public static int[] findFirstLastPositionOfElementInSortedArray(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[2];
        while(left<=right){
            if((nums[left] != target)){
                left++;
            }
            if((nums[right] != target)){
                right--;
            }
            if(nums[left]==nums[right] && nums[left] == target){
                result[0] = left;
                result[1] = right;
                return result;
            }
        }
        return (new int[]{-1, -1});
    }

    public static void main(String[] args){

        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;
        System.out.println("Output is : " + Arrays.toString(findFirstLastPositionOfElementInSortedArray(nums1, target1)));

        int[] nums2 = {5,7,7,8,8,10};
        int target2 = 6;
        System.out.println("Output is : " + Arrays.toString(findFirstLastPositionOfElementInSortedArray(nums2, target2)));

        int[] nums3 = {};
        int target3 = 0;
        System.out.println("Output is : " + Arrays.toString(findFirstLastPositionOfElementInSortedArray(nums3, target3)));
    }
}
