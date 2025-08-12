package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestGoogleTranslate {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://translate.google.com/");

        //driver.findElement(By.xpath("//textarea[@aria-label='Source text']")).sendKeys("como");
        //WebElement translation = driver.findElement(By.xpath("//span[@class='ryNqvb']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //WebElement languageDetect = driver.findElement(By.xpath("//span[@class='VfPpkd-YVzG2b']"));

        //String before = languageDetect.getText();
        driver.findElement(By.xpath("//textarea[@aria-label='Source text']")).sendKeys("como");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     String after = driver.findElement(By.xpath("//span[text()='Portuguese (Brazil) - Detected']")).getText();

        Assert.assertEquals(after,"Portuguese (Brazil) - Detected");




    }
}
