package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;

public class HandleWindow {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void handlingWindow() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        String parent = driver.getWindowHandle();
        System.out.println("Parent window id is: " + parent);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[contains(@href, '//www.google.com')]")).click();
        Set<String> allWindows = driver.getWindowHandles();
        for(String child:allWindows){
            if(!parent.equalsIgnoreCase(child)){
                driver.switchTo().window(child);
                driver.findElement(By.name("q")).sendKeys("Handling windows in selenium");
                driver.close();
            }
        }
        driver.switchTo().window(parent);
        System.out.println("Parent window title is: " + driver.getTitle());
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
