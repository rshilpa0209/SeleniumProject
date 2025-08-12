package Selenium;

import io.opentelemetry.semconv.UrlAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class VerifyLinks {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyForLinks() {
        driver.get("https://www.google.co.in/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement element : links){
            String url = element.getAttribute("href");
            verifyLinkActive(url);
        }
    }
    private void verifyLinkActive(String linkUrl) {
        try{
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()==200){
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
            }
        }
        catch(Exception e) {
        }
    }

    @AfterMethod
    public void quitBrowser() {

        driver.quit();
    }
}
