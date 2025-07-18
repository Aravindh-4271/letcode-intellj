package LetCodePractice.inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");

        WebElement clear = driver.findElement(By.xpath("//input[@id='clearMe']"));
        System.out.println("Text: "+ clear.getAttribute("value"));

        clear.clear();


    }
}
