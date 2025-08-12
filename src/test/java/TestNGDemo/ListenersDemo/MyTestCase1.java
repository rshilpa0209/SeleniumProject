package TestNGDemo.ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class MyTestCase1 {
    WebDriver driver;

    @Test
    public void verifyTitle(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("The title is " + driver.getTitle());
        driver.quit();
    }
}
