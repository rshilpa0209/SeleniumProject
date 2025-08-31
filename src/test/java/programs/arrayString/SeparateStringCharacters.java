/*
Given a string, separate digits, characters and special characters and remove duplicates from each.
 */
package programs.arrayString;

import java.util.*;

public class SeparateStringCharacters {
    public static List<String> separateStringCharacters(String str){
        StringBuilder digit = new StringBuilder();
        StringBuilder character = new StringBuilder();
        StringBuilder specialChar = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                digit.append(str.charAt(i));
            }
            else if(Character.isLetter(str.charAt(i))){
                character.append(str.charAt(i));
            }
            else{
                specialChar.append(str.charAt(i));
            }
        }

        return Arrays.asList(digit.toString(), character.toString(),specialChar.toString());
    }

    public static void removeDuplicates(String str){
        Set<Character> set = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        String input = "S***e#87^%len*#$iu777m%#%Jav(*a";
        List<String> list = separateStringCharacters(input);
        for(String str : list){
            System.out.println(str);
            removeDuplicates(str);

        }
    }

}
