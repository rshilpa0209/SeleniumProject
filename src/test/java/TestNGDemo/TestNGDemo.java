package TestNGDemo;

import org.testng.annotations.*;

public class TestNGDemo {

    @BeforeSuite
    public void Test1(){
        System.out.println("I am in Before Suite annotation.");
    }

    @BeforeGroups
    public void Test2(){
        System.out.println("I am in Before Groups annotation.");
    }

    @BeforeTest
    public void Test3(){
        System.out.println("I am in Before Test annotation.");
    }

    @BeforeClass
    public void Test4(){
        System.out.println("I am in Before Class annotation.");
    }

    @BeforeMethod
    public void Test5(){
        System.out.println("I am in Before Method annotation.");
    }

    @Test
    public void TC1(){
        System.out.println("I am TC1 in Test annotation.");
    }

    @Test
    public void TC2(){
        System.out.println("I am TC2 in Test annotation.");
    }

    @Test
    public void TC3(){
        System.out.println("I am TC3 in Test annotation.");
    }

    @AfterMethod
    public void Test6(){
        System.out.println("I am in After Method annotation.");
    }

    @AfterClass
    public void Test7(){
        System.out.println("I am in After Class annotation.");
    }

    @AfterTest
    public void Test8(){
        System.out.println("I am in After Test annotation.");
    }

    @AfterGroups
    public void Test9(){
        System.out.println("I am in After Groups annotation.");
    }

    @AfterSuite
    public void Test10(){
        System.out.println("I am in After Suite annotation.");
    }
}
