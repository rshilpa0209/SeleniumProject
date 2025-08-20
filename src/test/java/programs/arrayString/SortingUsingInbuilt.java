package programs.arrayString;

import java.util.Arrays;
import java.util.Collections;

public class SortingUsingInbuilt {

    public static void main(String[] args){
        int[] nums = {5,7,1,6,2,9};

        Arrays.sort(nums);
        System.out.println("Ascending: " + Arrays.toString(nums));

        Integer[] arr = new Integer[nums.length];
        for(int i=0; i< nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr));


    }
}
