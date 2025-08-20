import java.util.*;

public class Test {

        public static void main(String[] args) {

                String input = "Hello World! hello ChatGPT.";

                // Convert to lowercase and replace punctuation with space
                input = input.toLowerCase().replaceAll("[^a-z ]", " ");

                // Split into words
                String[] words = input.split("\\s+");

                // Count frequencies using LinkedHashMap (to preserve order)
                Map<String, Integer> map = new LinkedHashMap<>();

                for (String word : words) {
                                map.put(word, map.getOrDefault(word, 0) + 1);

                }

                // Build result string
                StringBuilder result = new StringBuilder();
                for (String str : map.keySet()) {
                        if (result.length() > 0) {
                                result.append(", ");
                        }
                        result.append(str).append(": ").append(map.get(str));
                }

                System.out.println(result.toString());


        }


}
