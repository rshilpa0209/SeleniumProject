/*  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1: Input: s = "anagram", t = "nagaram" Output: true
Example 2: Input: s = "rat", t = "car" Output: false  */

package programs.misc;

public class ValidAnagram {

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

    public static boolean validAnagram(String s, String t){
        s=s.toLowerCase();
        t=t.toLowerCase();
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        s_arr=sortedArray(s_arr);
        t_arr=sortedArray(t_arr);
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length()-1; i++){
            if(s_arr[i]!=t_arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Valid Anagram: " + validAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Valid Anagram: " + validAnagram(s2, t2));

        String s3 = "qwewret";
        String t3 = "ghgjj";
        System.out.println("Valid Anagram: " + validAnagram(s3, t3));

        String s4 = "classmate";
        String t4 = "teamslacs";
        System.out.println("Valid Anagram: " + validAnagram(s4, t4));
    }

}
