package TestNGDemo;

import org.testng.annotations.*;

public class TestNGHierarchyDemo {

    @BeforeSuite
    public void Test1(){
        System.out.println("I am BS1 in Before Suite annotation.");
    }

    @BeforeGroups
    public void Test2(){
        System.out.println("I am in Before Groups annotation.");
    }

    @BeforeTest
    public void Test3(){
        System.out.println("I am BT1 in Before Test annotation.");
    }

    @BeforeClass
    public void Test4(){
        System.out.println("I am BC1 in Before Class annotation.");
    }

    @BeforeMethod
    public void Test5(){
        System.out.println("I am BM1 in Before Method annotation.");
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
        System.out.println("I am AM1 in After Method annotation.");
    }

    @AfterClass
    public void Test7(){
        System.out.println("I am AC1 in After Class annotation.");
    }

    @AfterTest
    public void Test8(){
        System.out.println("I am AT1 in After Test annotation.");
    }

    @AfterGroups
    public void Test9(){
        System.out.println("I am in After Groups annotation.");
    }

    @AfterSuite
    public void Test10(){
        System.out.println("I am AS1 in After Suite annotation.");
    }

    @BeforeSuite
    public void Test11(){
        System.out.println("I am BS2 in Before Suite annotation.");
    }

    @AfterSuite
    public void Test12(){
        System.out.println("I am AS2 in After Suite annotation.");
    }

    @BeforeTest
    public void Test13(){
        System.out.println("I am BT2 in Before Test annotation.");
    }

    @BeforeClass
    public void Test14(){
        System.out.println("I am BC2 in Before Class annotation.");
    }

    @AfterClass
    public void Test15(){
        System.out.println("I am AC2 in After Class annotation.");
    }

    @AfterTest
    public void Test16(){
        System.out.println("I am AT2 in After Test annotation.");
    }

    @BeforeMethod
    public void Test17(){
        System.out.println("I am BM2 in Before Method annotation.");
    }

    @AfterMethod
    public void Test18(){
        System.out.println("I am AM2 in After Method annotation.");
    }
}
