package LetCodePractice.inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SendKeys {

    public SendKeys(WebDriver driver){
        driver = driver;
    }
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/test");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

   WebElement edit = driver.findElement(By.xpath("//a[text()=' Edit ']"));
    edit.click();
        System.out.println(driver.getTitle());

    WebElement input = driver.findElement(By.id("fullName"));
    input.sendKeys("Aravindhan" + Keys.TAB);









    }





}
