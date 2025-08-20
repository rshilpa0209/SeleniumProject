package javaTutorial;

public class ExampleA{

    int a = 10;
    static int b = 50;

    public static void main(String[] args){

        ExampleA ex1 = new ExampleA();
        System.out.println("Object1 - before change - a is " + ex1.a);
        ex1.a = 20;
        System.out.println("Object1 - after change - a is " + ex1.a);

        ExampleA ex2 = new ExampleA();
        System.out.println("Object2 - a is " + ex2.a);


        System.out.println("Before change - b is " + b);
        System.out.println("Before change - b is " + ExampleA.b);
        b=100;
        System.out.println("After change - b is " + b);
        System.out.println("After change - b is " + ExampleA.b);

    }
}
