package javaTutorial.interfaceTutorial;

public interface InterfaceA {
    int a = 100;
    static int b = 10;

    void methodA();

    default void defaultMethod(){
        System.out.println("This is Default Method in InterfaceA");
    }

    static void staticMethod(){
        System.out.println("This is Static Method in InterfaceA");
    }
}
