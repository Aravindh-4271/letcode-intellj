package LetCodePractice.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");

        WebElement button = driver.findElement(By.id("confirm"));
        button.click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Text: "+alert.getText());
        alert.dismiss();
        driver.quit();

    }
}
