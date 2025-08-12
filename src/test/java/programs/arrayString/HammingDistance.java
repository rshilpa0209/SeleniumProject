/* The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.
Example 1:      Input: x = 1, y = 4     Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:      Input: x = 3, y = 1     Output: 1
*/

package programs.arrayString;

public class HammingDistance {

    public static int hammingDistance(int x, int y){
        String binaryA = Integer.toBinaryString(x);
        String binaryB = Integer.toBinaryString(y);
        int maxLength = Math.max(binaryA.length(), binaryB.length());

        binaryA = String.format("%" + maxLength + "s", binaryA).replace(' ', '0');
        binaryB = String.format("%" + maxLength + "s", binaryB).replace(' ', '0');

        /* Explanation of String.format()
        String.format("%" + maxLength + "s", binaryA)--->This formats the string to be right-aligned within a field of width maxLength.
        Example: If binaryA = "100" and maxLength = 6, then:
        String.format("%6s", "100") → "   100"  // 3 leading spaces
        .replace(' ', '0')---->This replaces all the spaces (used to pad the left) with zeroes.
        " 100".replace(' ', '0') → "000100"
         */

        int hamming_distance =0;
        for(int i=0; i<maxLength; i++){
            if(binaryA.charAt(i)!=binaryB.charAt(i)){
                hamming_distance++;
            }
        }
        return hamming_distance;
    }

    public static void main(String[] args){

        int x1 = 1;
        int y1 = 4;
        System.out.println("Hamming distance between " + x1 + " and " + y1 + " is " + hammingDistance(x1, y1));

        int x2 = 3;
        int y2 = 1;
        System.out.println("Hamming distance between " + x2 + " and " + y2 + " is " + hammingDistance(x2, y2));
    }
}
