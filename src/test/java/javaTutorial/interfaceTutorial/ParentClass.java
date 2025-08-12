package javaTutorial.interfaceTutorial;

public class ParentClass {

    String color;
    ParentClass(String color){
        this.color = color;
        System.out.println("This is color " + color);
    }

    ParentClass(){
        System.out.println("This is default constructor in ParentClass");
    }

    public void show(){
        System.out.println("This is show method in ParentClass");
    }



}
