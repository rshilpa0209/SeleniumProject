/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:      Input: nums = [1,2,3,4,5,6,7], k = 3        Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:      Input: nums = [-1,-100,3,99], k = 2         Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

package programs.arrayString;

import java.util.Arrays;

public class RotateArray {

    //In this case, a new array is created
    public static int[] rotateArray1(int[] nums, int k){
        int[] rotated_nums = new int[nums.length];

        for(int i=0,index=nums.length-k; i<=k && index<nums.length; i++,index++){
            rotated_nums[i]=nums[index];
        }

        for(int i=k,j=0; i<nums.length && j<=k; i++,j++){
            rotated_nums[i]=nums[j];
        }
        return rotated_nums;
    }

    public static void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Function to reverse elements in the array from start to end
    public static void rotateArray(int[] nums, int k){
        int size = nums.length;
        if(size == 0 || k % size == 0) return;          //no need to rotate
        k = k % size;                                   // in case k > n

        reverseArray(nums, 0, size-1);        // Reverse entire array
        reverseArray(nums, 0, k-1);           // Reverse first k elements
        reverseArray(nums, k, size-1);             // Reverse remaining elements
    }


    public static void main(String[] args){

        int[] nums1 = {1,2,3,4,5,6,7};
        int k1 = 3;
        rotateArray(nums1, k1);
        System.out.println("Rotated array is: " + Arrays.toString(nums1));

        int[] nums2 = {-1,-100,3,99};
        int k2 = 2;
        rotateArray(nums2, k2);
        System.out.println("Rotated array is: " + Arrays.toString(nums2));
    }
}
