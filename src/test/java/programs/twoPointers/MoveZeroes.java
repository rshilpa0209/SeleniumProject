/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:      Input: nums = [0,1,0,3,12]      Output: [1,3,12,0,0]
Example 2:      Input: nums = [0]               Output: [0]
*/

package programs.twoPointers;
import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        System.out.println("Output is : " + Arrays.toString(nums));
    }

    public static void main(String[] args){

        int[] nums1 = {0,1,0,3,12};
        moveZeroes(nums1);

        int[] nums2 = {0};
        moveZeroes(nums2);

    }


}
