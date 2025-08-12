package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyBetweenTC {

    @Test(priority = 1, description = "This testcase will help to login to the application.")
    public void loginApplication(){
        System.out.println("Login to the application");
        Assert.assertEquals(12, 14);
    }

    @Test(priority = 2 , description = "This testcase will help to add items to cart.", dependsOnMethods = "loginApplication")
    public void addItemsToCart(){
        System.out.println("Items added to the cart");
    }

    @Test(priority = 3, description = "This testcase will help to checkout.")
    public void checkout(){
        System.out.println("Checkout completed");
    }

    @Test(priority = 4, description = "This testcase will help to complete the payment.", dependsOnMethods = "checkout")
    public void payment(){
        System.out.println("Payment completed successfully.");
    }

    @Test(priority = 5, description = "This testcase will help to see all orders.")
    public void allOrders(){
        System.out.println("Navigated to All Orders");
    }
}
