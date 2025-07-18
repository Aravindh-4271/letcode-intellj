package LetCodePractice.inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppendText  {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement input = driver.findElement(By.xpath("//input[@id='join']"));
        WebElement value = driver.findElement(By.xpath("//input[@value='I am good']"));

        input.sendKeys(Keys.HOME+"Yes,"+Keys.TAB);




    }
}
