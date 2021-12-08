package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[]args){


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box"); // sayfayı açar
        driver.manage().window().maximize(); // pencereyi büyütmek için kullanılır.

        WebElement nameElement = driver.findElement(By.id("userName")); // elementi bulur
        nameElement.click(); // elemente tıklar
        nameElement.sendKeys("Ezgi"); //elementin içini doldurur

        



    }

}