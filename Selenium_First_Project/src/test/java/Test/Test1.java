package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
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

        //4.Web Elementleri Nasıl Bulunur?

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
/

 */

        //Lesson_7

        /*


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");


        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnalbed = sportCheckBox.isEnabled();
        System.out.println(isEnalbed);



        WebElement sportCheckBoxLabel =driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

        // burada sportcheck boxı bulduk ve check edilip edilemediğine baktık.


        if (isEnalbed){

            try {
                System.out.println("entered try block");
                sportCheckBoxLabel.click();
            }
            catch (ElementClickInterceptedException e){
                sportCheckBoxLabel.click();
                System.out.println("entered catch block");
            }
        }
        boolean isSelected = sportCheckBox.isSelected();
        System.out.println(isSelected);
        */


        //Lesson 8 :Radio Buttons

        /*
        Algoritma

        1.bakacağımız yerin tıklanabilir olup olmadığını bakıyoruz.
        2.bunu kontrol ediyor yes ve no şeklinde
        3.buton tıklanabilir ise bunu bir if döngüsü ile yazdırıyoruz
        4.aşağıda yazan işaretlendi textini yazdırıyor
        5.if döngüsüyle botonun tıklı olup olmadığını kontrol ediyoruz --- boolean kullan
        6.!!! tıklama işlemi label yani yazılı olan kısma mı yoksa butona mı olduğuna bak
        7.label mi yoksa buton mu olduğunu buton selected kısmında görebilirsin
        8.disable buton için kontrol yap (no butonu için)
        9.is Enable fonksiyonu ile buna bakıyoruz.




        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        // is enable ile butonun kullanılabilir olup olmadığını baktık

        WebElement yesRadioButonLabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnable = yesRadioButonLabel.isEnabled();

        System.out.println("isEnabled: " + isEnable + "radio button is enabled");

        //butonun yanındaki yazıya tıkladık tıkladık

        if (isEnable){
            yesRadioButonLabel.click();
            System.out.println("button is clicked");
        }

        // burada butonu seçtik ve butonun seçilip seçilmediğine baktık. seçilmiş ise boolean olarak true döndürmesini sağladık
        WebElement yesRadioButon = driver.findElement(new By.ByCssSelector("input.custom-control-input[id='yesRadio']"));

        boolean isSelected = yesRadioButon.isSelected();


        // eğer seçilmiş ise yazı döndürmesini sağladık
        if (isSelected){
            System.out.println("Yes radio button is selected");
        }

        // yeni bir butonu seçtik

        WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        // seçtiğimiz yeni buton kullanılabilir mi kontrol ettik. olmadığı için boolean değeri falce döndü.

        WebElement noRadioButton =driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());


        // Lesson 9 : Çift Tıklama ,  Sağ Tıklama

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement massege = driver.findElement(By.id("doubleClickMessage"));
        String massegeText = massege.getText();
        System.out.println(massegeText);

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        action.click(rightClickButton).perform();

        boolean isEnable = rightClickButton.isEnabled();

        System.out.println("radio button is enabled");

        //butonun yanındaki yazıya tıkladık tıkladık

        if (isEnable){
            action.click(rightClickButton).perform();
            System.out.println("button is clicked");
        }
    */

        // Lesson 10 : Dinamik elementler

        















































    }

}