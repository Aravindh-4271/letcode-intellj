package LetCodePractice.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByIndexes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");

        WebElement superheros = driver.findElement(By.id("superheros"));
        Select dropdown = new Select(superheros);

        for (WebElement options : dropdown.getOptions()){
            System.out.println("The option is; "+ options.getText());
            String value = options.getAttribute("value");
            System.out.println("The option value is: "+ value);
        }

        if (dropdown.isMultiple()){
            System.out.println("Superheros is multi-select");
            dropdown.selectByValue("im");
            dropdown.selectByValue("ih");

        }else {
            System.out.println("Superheros is not multi-select");
        }
        WebElement text = driver.findElement(By.xpath("//p[@class='subtitle']"));
        System.out.println("Selected heros: "+ text.getText());

    }
}