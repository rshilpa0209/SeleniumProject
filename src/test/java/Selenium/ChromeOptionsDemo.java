package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ChromeOptionsDemo {

    WebDriver driver;

    @Test(priority = 1)
    public void chromeOptionsdemo() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        //Run Chrome in headless mode
        //options.addArguments("--headless");

        //Disable pop-up windows.
        //options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        //Start Chrome maximized by using the start-maximized switch:
        options.addArguments("start-maximized");

        //Launching Chrome in incognito mode
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(3000);
        driver.get("https://www.google.com/");

        driver.quit();
    }

    @Test(priority = 2)
    public void disableInfobar() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        //Disable "Chrome is being controlled by automated test software".
        //chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(3000);
        driver.get("https://www.google.com/");

        driver.quit();
    }

    @Test(priority = 3)
    public void handleCertificate() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");

        //DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.cacert.org/");
        Thread.sleep(3000);

        driver.quit();
    }
}
