/* Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.
Example 1:      Input: s = "Hello, my name is John"         Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:      Input: s = "Hello"                          Output: 1
Example 3:      Input: s = ""                               Output: 0
*/

package programs.arrayString;

public class CountSegments {

    public static int findNumberOfSegmentsInString(String s){
        s = s.trim();
        if(s == null || s.isEmpty()) return 0;
        String[] segments = s.split("\\s+");
        return segments.length;
    }

    public static void main(String[] args){

        String s1 = "Hello, my name is John";
        System.out.println("Number of segments in " + s1 + " is " + findNumberOfSegmentsInString(s1));

        String s2 = "Hello";
        System.out.println("Number of segments in " + s2 + " is " + findNumberOfSegmentsInString(s2));

        String s3 = "";
        System.out.println("Number of segments in " + s3 + " is " + findNumberOfSegmentsInString(s3));

    }
}
