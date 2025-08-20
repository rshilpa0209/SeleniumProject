package javaTutorial.interfaceTutorial;

public class ParentClass {

    int x =10;
    String color;
    ParentClass(String color){
        this();
        this.color = color;
        System.out.println("This is color " + color);
    }

//    ParentClass(int num) throws Exception{
//        num = num/0;
//        System.out.println("This is color " + color);
//    }

    ParentClass(){
        System.out.println("This is default constructor in ParentClass");
    }

    public void show(){
        System.out.println("This is show method in ParentClass");
    }



}
