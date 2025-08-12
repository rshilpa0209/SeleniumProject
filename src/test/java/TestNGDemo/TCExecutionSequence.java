package TestNGDemo;

import org.testng.annotations.Test;

public class TCExecutionSequence {

    @Test(priority = -2, description = "TestCase 1")
    public void testCase1(){
        System.out.println("This is TestCase 1.");
    }

    @Test(priority = 0, description = "TestCase 2")
    public void testCase2(){
        System.out.println("This is TestCase 2.");
    }

    @Test(priority = -5, description = "TestCase 3")
    public void testCase3(){
        System.out.println("This is TestCase 3.");
    }

    @Test(priority = 1, description = "TestCase 5")
    public void testCase5(){
        System.out.println("This is TestCase 5.");
    }

    @Test(priority = 1, description = "TestCase 4")
    public void testCase4(){
        System.out.println("This is TestCase 4.");
    }
}
