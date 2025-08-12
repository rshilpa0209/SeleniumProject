package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleAlert {
    WebDriver driver;

    @BeforeClass
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void handleSimpleAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        //Verify Alert message
        String actual_msg = alert.getText();
        String expected_msg = "I am a JS Alert";
        Assert.assertEquals(actual_msg, expected_msg);
        //Accepting the alert
        alert.accept();
    }

    @Test(priority = 2)
    public void handleConfirmationAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        //Dismissing the alert
        driver.switchTo().alert().dismiss();
    }

    @Test(priority = 3)
    public void handlePromptAlert() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        //Entering text in textbox then accepting the alert
        alert.sendKeys("Accept me");
        Thread.sleep(3000);
        alert.accept();
    }

    @AfterClass
    public void quitBrowser(){
        driver.quit();
    }
}
