package LetCodePractice.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");


        driver.switchTo().frame("firstFr");

        WebElement name = driver.findElement(By.xpath("//input[@name='fname']"));
        name.sendKeys("Aravindhan");
        WebElement email = driver.findElement(By.xpath("//input[@name='lname']"));
        email.sendKeys("sample123@gmail.com");
        WebElement text = driver.findElement(By.xpath("//p[@class='title has-text-info']"));
        String output = text.getText();
        System.out.println("Output: "+output);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.close();
    }
}
