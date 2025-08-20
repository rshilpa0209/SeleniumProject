package javaTutorial.interfaceTutorial;

public class ChildClass extends ParentClass{

    int x = 20;

    ChildClass() throws Exception {
        super("Red");
        //super();
        //super(4);
        System.out.println("This is default constructor in ChildClass");
    }



    public void show(){
        super.show();
        System.out.println("This is show method in ChildClass");
    }
}
