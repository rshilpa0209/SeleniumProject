package library;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class Utility {

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot)driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("./Screenshots/" + screenshotName + ".png");
            FileUtils.copyFile(source, dest);
            System.out.println("Screenshot captured");
        }
        catch (Exception e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());
            //throw new RuntimeException(e);
        }
    }

    public static void highlightElement(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;')", element);
        Thread.sleep(2000);
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px white;')", element);
        Thread.sleep(1000);
    }
}
