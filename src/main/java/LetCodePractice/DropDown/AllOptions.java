package LetCodePractice.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");

        WebElement lang = driver.findElement(By.id("lang"));
        Select select = new Select(lang);

        for (WebElement options: select.getOptions()){
            System.out.println("Lang is: "+ options.getText());
        }
        driver.quit();
    }
}
