package Selenium;

public class Test {

    public static void main(String[] arg){
        //test2();
        char c = 'a';
        int ac = (int)c;
        System.out.println(ac);
    }

    //@org.testng.annotations.Test
    public static void test2(){
        String str = "Shilpa";
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);

        char c= str.charAt(str.length()-1);
        System.out.println(c);
        System.out.println(str.length()-1);
    }

}
