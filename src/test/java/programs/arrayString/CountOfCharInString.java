package programs.arrayString;

public class CountOfCharInString {

    public static void main(String[] args){
        String s = "selenium";
        int count = 0;

        for(char c : s.toCharArray()){
            if(c=='e'){
                count++;
            }
        }

        System.out.println("Count of e in " + s + " is " + count);
    }
}




