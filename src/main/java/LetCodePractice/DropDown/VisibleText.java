package LetCodePractice.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VisibleText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");

        WebElement selectF = driver.findElement(By.id("fruits"));
        Select FruitSelect = new Select(selectF);

        for (WebElement fruitsOP : FruitSelect.getOptions()){
            System.out.println("Fruits options: "+ fruitsOP.getText());
        }
            FruitSelect.selectByVisibleText("Banana");
        WebElement selectedFruit = driver.findElement(By.xpath("//p[@class='subtitle']"));
        System.out.println("The Fruit you have selected: " +selectedFruit.getText());

        /*
        This is "isMultiple()
         */


        if (FruitSelect.isMultiple()){
            System.out.println("Fruit is Multi-select");
        }else {
            System.out.println("Fruit is not Multi-select");
        }

    }
}