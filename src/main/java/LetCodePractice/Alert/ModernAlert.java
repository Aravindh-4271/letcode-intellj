package LetCodePractice.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModernAlert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");

        WebElement button = driver.findElement(By.id("modern"));
        button.click();

        String text = driver.findElement(By.xpath("//p[@class='title']")).getText();
        System.out.println("Text: "+text);
        WebElement close = driver.findElement(By.xpath("//button[@aria-label='close']"));
        close.click();
        driver.close();
    }
}
