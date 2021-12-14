package Test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[]args) throws IOException, InterruptedException {

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


        // Lesson 10 : Dinamik elementler

        //Starts with : dinamic yani ıd si her sayfa yenilendiği zaman değişen elementler için kullanılır.
        // elementin nasıl başladığnı yazarak XPATH methodu ile arama yapılır.

        // Last : dinamic yani ıd si her sayfa yenilendiği zaman değişen elementler için kullanılır.
        // elementin nasıl bittiğini  yazarak XPATH methodu ile arama yapılır.

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        WebElement dynamicClickButton = driver.findElement(By.xpath("//div/button[starts-with(text() , 'Click Me')]"));
        dynamicClickButton.click();


        // Lesson 11 : Dinamic Elements 2

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        // 1.Dinamic Element = random ıd si olan text

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);

        // 2.Dinamic Element = 5 saniye sonra tıklanabilir buton

        WebElement fivesecondButton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(fivesecondButton));
          fivesecondButton.click();

        // 3. Dinamic Element = Rengi Değişen Buton

        WebElement colorChangeButton=  driver.findElement(By.id("colorChange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println("Before Change : " +className);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton,"class","mt-4 text-danger btn btn-primary"));
        className = colorChangeButton.getAttribute("class");
        System.out.println("After Change : " + className);

        // 4. Dinamic Element = 5 saniye sonra görünür olan buton

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();



        // Lesson 12 Kırık (Bozuk) Link Görsel

        // Kırık link.görsel : client tarafı servere bağlanmak için request atmış ancak bir hata dönmüş ve sayfada görülmüyor.
        //bu durum kullanıcısı kötüdür. Bunu selenium ve başka bir kütüphane ile kontrol edebiliriz.
        //Otomasyona kırık görsel ve link var mı şeklinde bir kontrol yapmak faydalı olacaktır.

        //  HTTP clienti koda entegre etmemiz gerekiyor.pom dosyasına meaven sitesindeki hTTPclienti yükledik.
        // <dependency>
        //            <groupId>org.apache.httpcomponents</groupId>
        //            <artifactId>httpclient</artifactId>
        //            <version>4.5.13</version>
        //        </dependency> kodunu yapıştırdık
        //
        //

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        // Hatalı link için 500 döndü

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
        HttpResponse response = client.execute(request);
        int StatusCode = response.getStatusLine().getStatusCode();
        System.out.println(StatusCode);

        // Hatasız için 200 döndü

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://demoqa.com/");
        HttpResponse response = client.execute(request);
        int StatusCode = response.getStatusLine().getStatusCode();
        System.out.println(StatusCode);


        // Lesson 13. Kırık Görseller

        // elementin attribute nu bularak arayacağız. xpath yöntemi ile arama yapıyoruz.

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        WebElement brokenimage = driver.findElement(By.xpath("//div/img[2]"));
        String brokenImageUrl = brokenimage.getAttribute("src");
        System.out.println(brokenImageUrl);


        // 200 dönmektedir. Bunun nedeni verilen imagein kırık olmamasıdır.Mantığı bu şekilde.
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(brokenImageUrl);
        HttpResponse response = client.execute(request);
        int StatusCode = response.getStatusLine().getStatusCode();
        System.out.println(StatusCode);



        // 14. Dosya İndirme

        // Dosyanın inip inmediğine bakmamız gerekiyor.

        // hata aldığın yerlerde end point koy ve debug modda çalıştır

//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://demoqa.com/upload-download");
//        driver.manage().window().maximize();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,200)");
//
//        WebElement downloadButtonn = driver.findElement(By.id("downloadButton"));
//        downloadButtonn.click();
//
//        String path = "C:\\Users\\ASUS\\Downloads";
//        String filename = "sampleFile.jpeg";
//        Thread.sleep(5000);
//
//
//        boolean isDownloaded =isFileDownloaded(path,filename);
//        System.out.println(isDownloaded);
//    }
//    public static boolean isFileDownloaded (String downloadPath, String fileName){
//        File file = new File(downloadPath);
//        File[] files = file.listFiles();
//
//        for (int i = 0 ; i<files.length ; i++){
//            if(files[i].getName().equals(fileName)){
//                files[i].delete();
//                return true;
//            }
//        }
//        return  false;
        // 15 . Dosya Yükleme

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
        System.out.println("butonu buldum");
        // URL ı bulmuyor
//        uploadButton.sendKeys("Users/ASUS/esktop/a");
//        System.out.println("yükledim ");

        // 16. Diğer Win/Tab lar Arasındaki Etkileşim Nasıl Olur?
        // diğer taba tıkla
        // pencere içindeki tüm tabları sayan bir liste oluşur.
        //Senin tabının numarasını gir ve o tabı yazdır
        // quit tüm pencereleri kapatır, close ise sadece o tabı kapatır.

       */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);
        driver.close();

        WebElement windowButton = driver.findElement(By.id("windowButton"));
        windowButton.click();

        List<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs2.size());

        driver.switchTo().window(tabs2.get(1));
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);
        driver.close();





    }


}