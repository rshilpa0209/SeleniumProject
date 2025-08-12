package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class CrossBrowserDemo {

    WebDriver driver;

    @Test
    @Parameters("browser")
    public void verifyTitle(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("ie")){
            driver = new InternetExplorerDriver();
        }
        else
            driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://workspace.google.com/intl/en-US/gmail/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));

        String actual_title = driver.getTitle();
        System.out.println(actual_title);
        Assert.assertTrue(actual_title.contains("Gmail"));

        driver.quit();

    }
}
