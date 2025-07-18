package LetCodePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
        private WebDriver driver;


    public void setup() {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/test");
    }
    public void inputs(){
        driver.findElement(By.xpath("//a[@href='/edit']")).click();
    }
    public void alert(){
        driver.findElement(By.xpath("//a[@href='/alert']")).click();
    }
    public void dropdown(){
        driver.findElement(By.xpath("//a[@href='/dropdowns']")).click();
    }
    public void frame(){
        driver.findElement(By.xpath("//a[@href='/frame']")).click();
    }
}
