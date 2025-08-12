package javaTutorial.interfaceTutorial;

public abstract class AbstractClassA {

    abstract void speak();

    //abstract void read();

    static void staticMethodInAbstractClassA(){
        System.out.println("This is a static method in AbstractClassA");
    }

    static void concreteMethodInAbstractClassA(){
        System.out.println("This is a concrete method in AbstractClassA");
    }


}
