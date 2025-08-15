/* Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:      Input: nums = [1,3,5,6], target = 5         Output: 2
Example 2:      Input: nums = [1,3,5,6], target = 2         Output: 1
Example 3:      Input: nums = [1,3,5,6], target = 7         Output: 4
*/

package programs.twoPointers;

public class SearchInsertPosition {

    //Linear time complexity O(n)
    public static int searchInsert(int[] nums, int target){
        for(int i=0; i < nums.length; i++){
            if(target<=nums[i] ){
                return i;
            }
        }
        return nums.length;
    }

    //Binary Search Version – O(log n)
    public static int searchInsertUsingBinarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            //int mid = (left + right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        System.out.println("Output is : " + searchInsertUsingBinarySearch(nums1, target1));

        int[] nums2 = {1,3,5,6};
        int target2 = 2;
        System.out.println("Output is : " + searchInsertUsingBinarySearch(nums2, target2));

        int[] nums3 = {1,3,5,6};
        int target3 = 7;
        System.out.println("Output is : " + searchInsertUsingBinarySearch(nums3, target3));

    }
}
