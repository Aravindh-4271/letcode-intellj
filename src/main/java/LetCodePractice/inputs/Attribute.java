package LetCodePractice.inputs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");

        WebElement getAT = driver.findElement(By.xpath("//input[@id='getMe']"));

        System.out.println("Attriburte: "+ getAT.getAttribute("value"));



        driver.close();


    }
}
