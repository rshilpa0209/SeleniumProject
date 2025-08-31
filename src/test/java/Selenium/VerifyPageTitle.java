package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyPageTitle {
    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://workspace.google.com/intl/en-US/gmail/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyPageTitleUsingGetTitle() {
        String actual_title = driver.getTitle();
        String expected_title = "Gmail: Private and secure email at no cost | Google Workspace";
        Assert.assertEquals(actual_title, expected_title);
        //Assert.assertTrue(actual_title.contains("Gmail"));
    }

    @Test
    public void verifyPageTitleUsingGetPageSource() {
        String page_source = driver.getPageSource();
        System.out.println(page_source);
        Assert.assertTrue(page_source.contains("Gmail"));
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }

}
