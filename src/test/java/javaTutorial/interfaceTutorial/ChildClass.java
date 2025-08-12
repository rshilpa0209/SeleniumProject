package javaTutorial.interfaceTutorial;

public class ChildClass extends ParentClass{

    ChildClass(){
        super("Red");
        //super();
        System.out.println("This is default constructor in ChildClass");
    }



    public void show(){
        super.show();
        System.out.println("This is show method in ChildClass");
    }
}
