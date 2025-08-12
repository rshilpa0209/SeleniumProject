//Find the largest number in an array

package programs.arrayString;

import org.testng.annotations.Test;

public class FindLargestNumberInArray {

    @Test
    public void largestNumber(){
        int[] nums = {45, 88, 3, 39, 60, 97, 14, 26, 51, 102};
        int largest_num = nums[0];
        for(int i=1; i<nums.length; i++){
            if(largest_num <= nums[i]){
                largest_num = nums[i];
            }
        }
        System.out.println("Largest number is: " + largest_num);
    }
}
