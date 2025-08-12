package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.PriorityQueue;

public class WebTable {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1, description = "Pick A date from Calender")
    public void datePicker() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        int total_dates = dates.size();
        for (int i = 0; i < total_dates; i++) {
            String date = dates.get(i).getText();
            if (date.equalsIgnoreCase("26")) {
                dates.get(i).click();
                break;
            }
        }
        /*for(WebElement element : dates){
            String date = element.getText();
            if(date.equalsIgnoreCase("26")){
                element.click();
                break;
            }
        }*/
            Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void verifyHeadersInWebTable(){
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

        List <WebElement> allHeaders = driver.findElements(By.xpath("//table[contains(@id, 'cust')]//th"));
        int allHeaders_count = allHeaders.size();
        Assert.assertEquals(allHeaders_count, 5, "Headers count is not correct.");
        boolean status = false;
        for(WebElement element : allHeaders){
            String header = element.getText();
            System.out.println(header);
            if(header.contains("Action")){
                status = true;
                break;
            }
        }
        Assert.assertTrue(status, "Header is not present.");
    }

    @Test(priority = 3)
    public void verifyRowsCountInWebTable(){
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

        List <WebElement> allRows = driver.findElements(By.xpath("//table[contains(@id, 'cust')]//tr"));
        int allRows_count = allRows.size();
        System.out.println("The total number of rows are:  " + allRows_count);
        Assert.assertEquals(allRows_count, 7, "Rows count is not correct.");
    }

    @Test(priority = 4)
    public void verifyDataInWebTable(){
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

        List <WebElement> allData = driver.findElements(By.xpath("//table[contains(@id, 'cust')]//td"));
        int allData_count = allData.size();
        Assert.assertEquals(allData_count, 30, "Data count is not correct.");
        boolean recordStatus = false;
        for(WebElement element : allData){
            String record = element.getText();
            System.out.println(record);
            if(record.contains("Ola")){
                recordStatus = true;
                break;
            }
        }
        Assert.assertTrue(recordStatus, "Record is not present.");
    }

    @Test(priority = 5)
    public void verifyColumnDataInWebTable(){
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

        List <WebElement> companyNames = driver.findElements(By.xpath("//table[contains(@id, 'cust')]//tr//td[2]"));
        int companyNames_count = companyNames.size();
        Assert.assertEquals(companyNames_count, 6, "Data count is not correct.");
        boolean companyStatus = false;
        for(WebElement element : companyNames){
            String record = element.getText();
            System.out.println(record);
            if(record.contains("Jenkins")){
                companyStatus = true;
                break;
            }
        }
        Assert.assertTrue(companyStatus, "This company is not present.");
    }

    @Test(priority = 6)
    public void clickCheckboxInWebTable() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

        //Click on checkbox for "Selenium"
        driver.findElement(By.xpath("//td[text()='Selenium']/preceding-sibling::td//input")).click();
        Thread.sleep(2000);

        //Click on "Know More" link for "Ola"
        driver.findElement(By.xpath("//td[text()='Ola']/following-sibling::td//a")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }
}
