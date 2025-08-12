package programs.arrayString;

import org.testng.annotations.Test;

public class MissingNumberInASequence {

    @Test
    public void missingNumber(){
        int[] nums = {1, 2, 3, 5, 6, 7};
        int last_num = nums[nums.length-1];
        int sum = (last_num * (last_num +1))/2;

        for(int i=0; i< nums.length; i++){
            sum = sum - nums[i];
        }
        System.out.println("Missing number is: " + sum);

    }
}
