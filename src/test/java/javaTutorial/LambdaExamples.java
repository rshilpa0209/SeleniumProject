package javaTutorial;

import java.util.Arrays;
import java.util.List;

public class LambdaExamples {

    public static void lambdaForEach(){

        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "C#");

        list.forEach(language -> System.out.println(language));
    }

    public static void examples(){



    }

    public static void main(String[] args){
        lambdaForEach();

        Addable ad = (a,b) -> (a + b);
        System.out.println("Addition : " + ad.add(10,20));
    }
}
