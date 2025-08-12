//Find the second-largest number in an array

package programs.arrayString;

import org.testng.annotations.Test;

public class FindSecondLargestInArray {

    @Test
    public void secondLargestNumber() {
        int[] nums = {45, 88, 3, 39, 60, 82, 14, 26, 51, 72};
        int largest_num = nums[0];
        int second_lar_num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (largest_num < nums[i]) {
                second_lar_num = largest_num;
                largest_num = nums[i];
            }
            else if (nums[i] > second_lar_num) {
                second_lar_num = nums[i];
            }
        }
        System.out.println("Second largest number is: " + second_lar_num);
    }
}
