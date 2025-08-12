package programs.arrayString;

public class ReverseCharArray {

    public static void reverseCharArray(char[] char_array) {
        int n;
        if (char_array.length % 2 == 0) {
            n = char_array.length / 2;
        } else {
            n = (char_array.length + 1) / 2;
        }
        for (int i = 0; i < n; i++) {
            char temp = char_array[i];
            char_array[i] = char_array[char_array.length - 1 - i];
            char_array[char_array.length - 1 -i] = temp;
        }
        for (char chars : char_array) {
            System.out.print(chars + " ");
        }
        System.out.println(" ");
    }

        public static void main(String[] args){

            char[] char_array1={'h','e','l','l','o'};
            reverseCharArray(char_array1);

            char[] char_array2={'h','a','n','n','a', 'h'};
            reverseCharArray(char_array2);

            char[] char_array3={'w','e','l','c','o','m','e'};
            reverseCharArray(char_array3);

        }







}
