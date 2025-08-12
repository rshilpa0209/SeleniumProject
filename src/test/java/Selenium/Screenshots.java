package Selenium;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.IOException;


public class Screenshots {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://workspace.google.com/intl/en-US/gmail/");
        Utility.captureScreenshot(driver, "gmailNavigation");

        driver.findElement(By.xpath("//div[@class='header__aside']//a[@aria-label='Sign into Gmail']")).click();
        Utility.captureScreenshot(driver, "SignIntoGmail");
    }

    @Test
    public void captureScreenshot() throws IOException {
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
        /*  -----Commenting these lines as the same code is in Utility class-----
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Selenium.Screenshots/gmail.png");
        FileUtils.copyFile(source, dest);
         */
        Utility.captureScreenshot(driver, "TypeEmailId");
    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }

}
