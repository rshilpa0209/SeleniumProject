package javaTutorial.interfaceTutorial;

public class Main {

    public static void main(String[] args){
        /* Class to one Interface → ClassA implements InterfaceA

        InterfaceA.staticMethod();
        System.out.println("This is static variable in InterfaceA : " + InterfaceA.a);
        System.out.println("This is static variable in InterfaceA : " + InterfaceA.b);

        ClassA a = new ClassA();
        a.defaultMethod();
        a.show();
*/

        /* Class to multiple Interfaces → ClassB implements InterfaceA, InterfaceC

        ClassB b = new ClassB();
        b.defaultMethod();
        b.methodA();
        b.methodC();
*/

        /* Interface to one Interface → InterfaceB extends InterfaceA & ClassC implements InterfaceB

        ClassC c = new ClassC();
        c.defaultMethod();
        c.methodA();
        c.methodB();
*/

        /* Interface to multiple Interfaces → InterfaceD extends InterfaceB & InterfaceC and ClassD implements InterfaceD

        ClassD d= new ClassD();
        d.defaultMethod();
        d.methodA();
        d.methodB();
        d.methodC();
        d.methodD();
*/

        /* Anonymous Class
        InterfaceA a = new InterfaceA() {
            @Override
            public void methodA() {
                System.out.println("This is anonymous class");
            }
        };
        a.methodA();
        a.defaultMethod();
        InterfaceA.staticMethod();

*/
        ChildClass cc = new ChildClass();
        //new ChildClass();
        cc.show();







    }
}
