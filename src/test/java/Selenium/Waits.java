package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Waits {
        WebDriver driver;

        @BeforeMethod
        public void openBrowser() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @Test(priority = 1)
        public void implicitlyWait(){
            driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
            WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));

            if(element.isDisplayed()){
                System.out.println("Element is displayed");
            }
            else{
                System.out.println("Element is not displayed");
            }
        }

    @Test(priority = 2)
    public void explicitWait(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        if(element.isDisplayed()){
            System.out.println("Element is displayed");
        }
        else{
            System.out.println("Element is not displayed");
        }
    }

    @Test(priority = 3)
    public void fluentWait(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement ele = driver.findElement(By.xpath("//p[@id='demo']"));
                String value = ele.getAttribute("innerHTML");
                if(value.equalsIgnoreCase("WebDriver")){
                    return ele;
                }
                else{
                    System.out.println("Text displayed is: " + value);
                    return null;
                }
            }
        });
        System.out.println("Is element displayed? " + element.isDisplayed());
    }

        @AfterMethod
        public void quitBrowser() {
            driver.quit();
        }

}
