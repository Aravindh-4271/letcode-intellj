package LetCodePractice.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();

        driver.switchTo().frame(0);

        WebElement name = driver.findElement(By.xpath("//input[@name='fname']"));
        name.sendKeys("Aravindhan");
        WebElement email = driver.findElement(By.xpath("//input[@name='lname']"));
        email.sendKeys("sample123@gmail.com"+ Keys.TAB+"aravindh123@gmail.com"+Keys.ENTER);
        WebElement text = driver.findElement(By.xpath("//p[@class='title has-text-info']"));
        String output = text.getText();
        System.out.println("Output: "+output);

//        driver.switchTo().frame(1);
//        WebElement email = driver.findElement(By.xpath(""));
//        email.sendKeys("aravindh123@gmail");
//        driver.switchTo().defaultContent();








        Thread.sleep(2000);

        driver.switchTo().defaultContent();

    }
}
