/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:      Input: nums = [0,7,9,0,0,0,1,0,3,12,9,7,0]      Output: [0,0,0,0,0,0,7,9,1,3,12,9,7]
Example 2:      Input: nums = [0]               Output: [0]
*/
package programs.twoPointers;

import java.util.Arrays;

public class MoveZeroesToLeft {
    
    public static void moveZeroes(int[] nums){
        int right=nums.length-1;
        for(int left=nums.length-1; left>=0; left--){
            if(nums[left] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;

            }
        }
        System.out.println("Output is : " + Arrays.toString(nums));
    }
    
    public static void main(String[] args){
        int[] nums1 = {0,7,9,0,0,0,1,0,3,12,9,7,0};
        moveZeroes(nums1);

        int[] nums2 = {0,1,0,3,12};
        moveZeroes(nums2);
    


    }
    
}


