package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators {

    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

         //Arama kutusuna locate edelim
        //Arama kutusuna iphone yazdiralim ve aratalim
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
/*
Bir webelentin locatini buirden fazla kullanacaksaniz bir webelemente degisken olarak atayabilirsiniz
Webelement aramakutusu =  driver.findElement(By.id("twotabsearchtextbox")); seklinde kullanabiliriz
1-Locate islemi bittikten sonra eger webelemente bir metin gondereceksek sendKeys() methodu kullaniriz
2-webelement tiklayacaksak click() methodu kullaniriz
3-webelementin uzerindekin yaziyi almak istiyorsak getText() methodunu kullaniriz
4-sendkeys() methodundan sonra(yani webelemnt metin gonderdikten sonra )Keys.Enter ile yada
submit() methodu ile manuel olarak yaptigimiz gibi otomasyonda da yapabiliriz
 */



        // sayfayi kapatalim
          driver.close();







    }



}
