package programs.arrayString;

public class ZipPairs {

    public static String zipPairs(String input){
        String[] words = input.split("\\s+");
        String word1 = words[0];
        String word2 = words[1];
        int n = Math.min(word1.length(), word2.length());
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (out.length() > 0) {
                out.append(' ');
            }
            out.append(word1.charAt(i)).append(word2.charAt(i));
        }

        // Handle leftover characters if any (optional; keeps behavior well-defined)
        if (word1.length() > n) {
            for (int i = n; i < word1.length(); i++) {
                out.append(' ').append(word1.charAt(i));
            }
        } else if (word2.length() > n) {
            for (int i = n; i < word2.length(); i++) {
                out.append(' ').append(word2.charAt(i));
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {

        String input1 = "capgemini interview";
        System.out.println(zipPairs(input1));

        String input2 = "capgemini intervi";
        System.out.println(zipPairs(input2));

    }
}
