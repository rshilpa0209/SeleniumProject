package programs.arrayString;

import java.util.*;


public class LargestNumberFromArray {

    public static String largestNumberFromAnArray(int[] nums){
        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b)  -> (b + a).compareTo(a+b));
        System.out.println(Arrays.toString(arr));

        if(arr[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String arg : arr){
            sb.append(arg);
        }
        return sb.toString();
    }

public static void main(String[] args){
    int[] nums1 = {3, 30, 34, 5, 9};
    System.out.println(largestNumberFromAnArray(nums1)); // 9534330

    int[] nums2 = {10, 2};
    System.out.println(largestNumberFromAnArray(nums2)); // 210

    int[] nums3 = {0, 0};
    System.out.println(largestNumberFromAnArray(nums3));
}

}
