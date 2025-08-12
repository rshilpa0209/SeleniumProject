package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void BasicExampleONStrem(){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Stream<String> stream1 = names.stream();
        stream1.filter(name-> name.startsWith("C"))
                .forEach(System.out::println);

        Stream<String> stream2 = names.stream();
        stream2.filter(name-> name.equals("Alice"))
                .forEach(System.out::println);

        //System.out.println(streamObj.count());

        Stream<String> stream3 = names.stream();
        stream3.map(String:: toUpperCase).forEach(System.out::println);

        Stream<String> stream4 = names.stream();
        System.out.println(stream4.anyMatch(name-> name.startsWith("C")));

        Stream<String> stream5 = names.stream();
        System.out.println(stream5.allMatch(name-> name.startsWith("C")));

        Stream<String> stream6 = names.stream();
        System.out.println(stream6.allMatch(name-> name.length() >3));
    }

    public static void main(String[] arg){
        BasicExampleONStrem();
    }
}
