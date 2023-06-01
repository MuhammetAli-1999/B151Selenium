package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {
    public static void main(String[] args) {


        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasina git
        driver.get("https://amazon.com");


        //sayfadaki linklerin sayisini ve linkkleri yazdiralim
        /*
        findelement ile bir webelemente ulasabilirken birden fazla webelement icin findelement() methodunu
        kullaniriz.Bu webelementin sayisina ulasmak icin ya da bu webelementlerin yazisini konsola yazdirablmek icin
        List<webelemen> linklerListesi = driver.findelements(By.locator(locator degeri ))olarak kullaniriz.
        Olusturmus oldugumuz listi loop ile consola yazdirabiliriz

         */
       List<WebElement> linklerlistesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi = "+ linklerlistesi.size());

       /* for (WebElement w:linklerlistesi){
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }
        }*/

        //Lambda ile yazdiralim

     linklerlistesi.forEach(link ->{if (!link.getText().isEmpty()){
      System.out.println(link.getText());}});

       //shop deals in eectronics webelementinin yazsisini yazdiralim
        System.out.println("**********************");
        System.out.println(driver.findElement(By.id("nav-link accountList-nav-line-1")).getText());
        WebElement webelementYazisi =driver.findElement(By.id("nav-link accountList-nav-line-1"));
        System.out.println(webelementYazisi.getText());

          driver.close();



    }
}
