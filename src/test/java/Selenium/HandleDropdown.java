package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class HandleDropdown {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void handlingDropdown() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@role='button'][@data-testid='open-registration-form-button']")).click();

        //Date dropdown
        WebElement date_dd = driver.findElement(By.xpath("//select[@id='day']"));
        Select date = new Select(date_dd);
        date.selectByIndex(2);
        //To verify total count in dropdown
        System.out.println("Total count in Date dropdown is: " + date.getOptions().size());

        //Month dropdown
        WebElement month_dd = driver.findElement(By.xpath("//select[@id='month']"));
        Select month = new Select(month_dd);
        month.selectByVisibleText("Aug");
        //To print all values of dropdown
        List<WebElement> month_list = month.getOptions();
        for(WebElement element : month_list){
            System.out.println(element.getText());
        }

        //Year dropdown
        WebElement year_dd = driver.findElement(By.xpath("//select[@id='year']"));
        Select year = new Select(year_dd);
        year.selectByVisibleText("2018");
        //To verify what text is selected in dropdown
        System.out.println("Selected option is: " + year.getFirstSelectedOption().getText());
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void handleBootstrapDropdown() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='menu1']")).click();
        Thread.sleep(2000);
        //No Select tag available for dropdown in Bootstrap. So, Select class can't be used. We have to deal with ul,li,div,span etc. HTML tags.
        List<WebElement> dropdown_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
        for(WebElement element : dropdown_menu){
            System.out.println("Element is: " + element.getText());
            if(element.getText().equals("JavaScript")){
                element.click();
                break;
            }
        }
        /*  The below for loop with getAttribute will also work.
        for(WebElement element : dropdown_menu){
            String innerhtml = element.getAttribute("innerHTML");
            System.out.println("Element is: " + innerhtml);
            if(innerhtml.contentEquals("JavaScript")){
                element.click();
                break;
            }
        }*/
    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }
}
