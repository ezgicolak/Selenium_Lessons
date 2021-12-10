package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Test1 {
    public static void main(String[]args){

/*

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Lesson 3

        driver.get("https://demoqa.com/text-box"); // sayfayı açar
        driver.manage().window().maximize(); // pencereyi büyütmek için kullanılır.

        WebElement fullname = driver.findElement(By.id("userName")); // elementi bulur
        fullname.click(); // elemente tıklar
        fullname.sendKeys("Ezgi"); //elementin içini doldurur

        //Lesson 4

        //Kullanılan Kavramlar : CSS Selector ,

        //incele dedikten sonra kodları gördüğümüz ekranda ctrl+f dediğimiz zaman arama satırına
        //istediğimiz keywordu yazarak taglerı kullanabiliriz

        //CSS Selector

        // <input autocomplete="off" placeholder="name@example.com"
        // type="email" id="userEmail" class="mr-sm-2 form-control"> --- element

        //ctrl + f = input.mr-sm-2[type="email"] buradan type name buluyoruz.
        //ctrl + f = input.mr-sm-2[ıd="userName"]

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("user.name@gmail.com");


        //CSS selector ile arama yaptık.
        WebElement currentaddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentaddress.click();
        currentaddress.sendKeys("yorum");

        // ekranın altına kadar kaymasını sağıyoruz. diğer türlü permanent kısmını görümüyor.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        // id ile arama yaptık
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("sakarya ,serdivan");

        //submit butonuna tıklayarak giriş yapmış oluyor.

        WebElement submit = driver.findElement(new By.ByCssSelector("button.btn"));
        submit.click();

        // Lesson 5

        //x path kullanımı

        WebElement nameText = driver.findElement(By.cssSelector("#name"));
        String name = nameText.getText();
        System.out.println(name);

        //CSS selector kullanımı

        WebElement mailText = driver.findElement(By.cssSelector("#email"));
        String mail = mailText.getText();
        System.out.println(mail);

 */




        //Lesson 6 : Check Box 1

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox"); // sayfayı açar
        driver.manage().window().maximize(); // pencereyi büyütmek için kullanılır.

        String homeCheckboxCssValue = "label[for = 'tree-node-home'] span.rct-checkbox svg ";
        //chechbox  içindeki check olup olmama durumunu string olarak tuttuk.


        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckboxCssValue));
        homeCheckBox .click();
        //checkboxı tıkladı ve value değeri değişti

        homeCheckBox =  driver.findElement(new By.ByCssSelector(homeCheckboxCssValue));
        String homeCheckboxClassname = homeCheckBox .getAttribute("class");
        // sayfayı tekrar açıp class değerine tekrar baktı


        if (homeCheckboxClassname.equals("rct-icon rct-icon-check")){
            System.out.println("checkbox is checked");
        }
        else{
            System.out.println("Checkbox is unchecked");
        }

        //tıkladıktan sonraki değer ile tıklamadan önce ilk açılan halinin aynı olup olmadığını kontrol ettik. 




















        



    }

}