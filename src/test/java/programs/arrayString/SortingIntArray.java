//Program to sort an integer array

package programs.arrayString;

public class SortingIntArray {

    public static void main(String[] args){
        int[] nums = {45, 88, 3, 39, 60, 82, 14, 26, 51, 72};
        for(int i=0; i< nums.length-1; i++){
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1] = temp;
                }
                /*for(int num: nums){
                    System.out.print(num + ", ");
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");*/
            }
        }
        System.out.print("Sorted Int Array: ");
        for(int num: nums){
            System.out.print(num + ", ");
        }
    }
}
