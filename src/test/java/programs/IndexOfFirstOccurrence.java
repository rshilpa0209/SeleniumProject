/* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
Example 1:      Input: haystack = "sadbutsad", needle = "sad"       Output: 0
Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.
Example 2:      Input: haystack = "leetcode", needle = "leeto"      Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/

package programs;

public class IndexOfFirstOccurrence {

    public static int findIndexOfFirstOccurrenceInAString(String haystack, String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args){
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Index of first occurrence of " + needle1 + " in " + haystack1 + " is " + findIndexOfFirstOccurrenceInAString(haystack1, needle1));

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Index of first occurrence of " + needle2 + " in " + haystack2 + " is " + findIndexOfFirstOccurrenceInAString(haystack2, needle2));

        String haystack3 = "sadsadsad";
        String needle3 = "sad";
        System.out.println("Index of first occurrence of " + needle3 + " in " + haystack3 + " is " + findIndexOfFirstOccurrenceInAString(haystack3, needle3));

    }


}
