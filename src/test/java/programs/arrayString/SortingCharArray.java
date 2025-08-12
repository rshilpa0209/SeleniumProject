//Program to sort a char array

package programs.arrayString;

import java.util.Arrays;

public class SortingCharArray {

    public static char[] sortedArray(char[] arr){
        for(int i=0; i< arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        char[] arr1 = {'y', 'd', 'k', 'q', 'e', 'i', 'a', 'v', 'b', 'l'};
        System.out.println("Sorted char array: " + Arrays.toString(sortedArray(arr1)));
    }
}
