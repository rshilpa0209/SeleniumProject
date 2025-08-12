/* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Custom Judge:   The judge will test your solution with the following code:
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length
int k = removeDuplicates(nums); // Calls your implementation
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Example 1:      Input: nums = [1,1,2]       Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]         Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

package programs.twoPointers;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static int removeDuplicatesFromSortedArray(int[] nums){
        if(nums.length==0) return  0;
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args){

        int[] nums1 = {1,1,2};
        int k1 = removeDuplicatesFromSortedArray(nums1);
        System.out.println("Number of unique elements : " + k1 );
        System.out.print("Modified array : ");
        for(int i=0; i<k1; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println("");

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = removeDuplicatesFromSortedArray(nums2);
        System.out.println("Number of unique elements : " + k2 );
        System.out.print("Modified array : ");
        for(int i=0; i<k2; i++){
            System.out.print(nums2[i] + " ");
        }


    }
}
