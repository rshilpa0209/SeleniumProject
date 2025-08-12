//Write a program to print multiplication table for the given numbers.

package programs.misc;

public class MultiplicationTable {

    public static void multiplicationTable(int num){
        int a=1;
        while(a<=10){
            System.out.println(num + " x " + a + " = " + num*a);
            a++;
        }
    }
    public static void main(String[] args){
       // multiplicationTable(3);
        multiplicationTable(6);
        //multiplicationTable(13);
    }
}
