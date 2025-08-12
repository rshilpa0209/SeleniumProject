package Selenium;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptExecutorDemo {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void jsAlert() throws InterruptedException {
        driver.get("https://www.google.co.in/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('This is JavascriptExecutor example.')");
        //js.executeScript("prompt('Please enter your name.')");
        //js.executeScript("confirm('Do you confirm?')");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void jsClick1() throws InterruptedException {
        driver.get("https://login.yahoo.com/");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("abc@yahoo.com");

        /*Getting Exception when try to click on the checkbox: "ElementNotInteractableException: element not interactable"
        driver.findElement(By.xpath("//input[@id='persistent']")).click();   */

        //Clicking on Stay signed in text - this will work
        //driver.findElement(By.xpath("//*[contains(text(), 'Stay signed in')]")).click();

        //Using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("document.getElementById('persistent').click()");
        Thread.sleep(10000);
    }

    @Test(priority = 3)
    public void jsClick2() throws InterruptedException {
        driver.get("https://login.yahoo.com/");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("abc@yahoo.com");

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", checkbox);
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void jsTypeInTextbox1() throws InterruptedException {
        driver.get("https://login.yahoo.com/");
        WebElement email = driver.findElement(By.xpath("//input[@id='login-username']"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='abc@yahoo.com'", email);
        js.executeScript("arguments[0].click()", checkbox);
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void jsTypeInTextbox2() throws InterruptedException {
        driver.get("https://login.yahoo.com/");
        WebElement email = driver.findElement(By.xpath("//input[@id='login-username']"));
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=arguments[1]",email, "abc@yahoo.com");
        js.executeScript("arguments[0].click()", checkbox);
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void jsScrollPageDown() throws InterruptedException {
        driver.get("https://jqueryui.com/");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //This will scroll page 600 pixel vertical.
        js.executeScript("scroll(0,600)");
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void jsScrollIntoView() throws InterruptedException {
        driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//*[@id='mCSB_3_container']/p[10]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //This will scroll until element is not visible or in view
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        Thread.sleep(2000);
        System.out.println(element.getText());
    }

    @Test(priority = 8)
    public void jsHighlightElement() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
        Utility.highlightElement(driver, userName);
        userName.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        Utility.highlightElement(driver, password);
        password.sendKeys("abc123");

        WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
        Utility.highlightElement(driver, logIn);
        logIn.click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }
}
