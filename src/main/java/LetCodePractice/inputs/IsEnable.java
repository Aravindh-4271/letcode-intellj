package LetCodePractice.inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");

        WebElement isEnable = driver.findElement(By.xpath("//input[@id='noEdit']"));


        if (isEnable.isEnabled()){
            System.out.println("The textbox is enabled");
        }else {
            System.out.println("The textbox is disabled");
        }
    }
}
