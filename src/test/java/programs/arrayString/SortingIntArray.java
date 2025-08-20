//Program to sort an integer array

package programs.arrayString;

import java.util.Arrays;

public class SortingIntArray {

    public static void main(String[] args){
        int[] nums = {45, 88, 3, 39, 60, 82, 14, 26, 51, 72};
        System.out.println("original Int Array: " + Arrays.toString(nums));

        for(int i=0; i< nums.length-1; i++){
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Int Array: " + Arrays.toString(nums));
    }
}
