package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class VerifyErrorMessage {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://workspace.google.com/intl/en-US/gmail/");
        driver.manage().window().maximize();
        //driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//div[@class='header__aside']//a[@aria-label='Sign into Gmail']")).click();
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'][text()='Next']")).click();
    }

    @Test
    public void verifyErrorMessageUsingGetText() {
        String actual_error = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
        String expected_error = "Enter an email or phone number";
        Assert.assertEquals(actual_error, expected_error);
        //Assert.assertTrue(actual_error.contains("Enter an email"));
    }

    /*@Test
    public void verifyErrorMessageUsingGetAttribute() {
        String actual_error = driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getAttribute("innerHTML");
        String expected_error = "Enter an email or phone number";
        Assert.assertEquals(actual_error, expected_error);
    }*/

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }

}
