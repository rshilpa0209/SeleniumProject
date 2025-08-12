package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PerformActions {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void rightClick() throws InterruptedException {
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Copy']")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

    @Test(priority = 2)
    public void doubleClick() throws InterruptedException {
        driver.get("https://api.jquery.com/dblclick/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']/parent::body/div"))).perform();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void dragAndDrop1() throws InterruptedException {
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//dhtmlxcode.com/m/3e0b5r57']")));
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        WebElement src = driver.findElement(By.xpath("//span[text()='Ian Rankin']"));
        WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

        // Scroll the source element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", src);

        // Scroll the destination element into view
        js.executeScript("arguments[0].scrollIntoView(true);", dest);

        action.clickAndHold(src)
                .pause(Duration.ofSeconds(2))
                .moveToElement(dest)
                .pause(Duration.ofSeconds(2))
                .release()
                .build().perform();
    }

    @Test(priority = 4)
    public void dragAndDrop2() throws InterruptedException {
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='//dhtmlxcode.com/m/3e0b5r57']")));
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        WebElement src = driver.findElement(By.xpath("//span[text()='Ian Rankin']"));
        WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

        // Scroll the source element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", src);

        // Scroll the destination element into view
        js.executeScript("arguments[0].scrollIntoView(true);", dest);

        action.dragAndDrop(src, dest).perform();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void draggable() throws InterruptedException {
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 300, 150).perform();
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void keyboardEventsEx1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//p[@id='result']"));
        if(element.getText().contains("ESCAPE")){
            System.out.println("Keys pressed");
        }
    }

    @Test(priority = 7)
    public void keyboardEventsEx2() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(1))
                .sendKeys("uname")
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(1))
                .sendKeys("pass")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .pause(Duration.ofSeconds(1))
                .sendKeys(Keys.ARROW_DOWN)
                .build()
                .perform();
        Thread.sleep(2000);
    }

    @Test(priority = 8)
    public void moverHover() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        Actions action = new Actions(driver);
        WebElement tools = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
        action.moveToElement(tools).perform();

        List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
        for(WebElement element : links){
            String text = element.getText();
            System.out.println("Link name is: " + text);
            if(text.equalsIgnoreCase("Appium")){
                element.click();
                break;
            }
        }
        Thread.sleep(2000);
    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }
}
