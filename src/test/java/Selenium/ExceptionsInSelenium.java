package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ExceptionsInSelenium {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void invalidArgumentExceptionExample() {
        //This will throw exception "InvalidArgumentException". "http" is missing in the url.
        //driver.get("www.google.com");

        driver.get("https://www.google.com");
    }

    @Test(priority = 2)
    public void noSuchSessionExceptionExample() {
        //This will throw exception "NoSuchSessionException".
        //This exception is thrown when any command is called after driver.quit(); or driver.close();
        //driver.close();  or driver.quit();

        driver.get("https://www.google.com");
    }

    @Test(priority = 3)
    public void elementNotInteractableExceptionExample() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

        //Two elements with id "male". It will click on the first element. This will throw exception because the element is hidden
        //driver.findElement(By.id("male")).click();

        //solution
        List<WebElement> radio_button_male = driver.findElements(By.id("male"));
        for(WebElement element : radio_button_male){
            int x = element.getLocation().getX();
            if(x!=0){
                element.click();
                break;
            }
        }
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
