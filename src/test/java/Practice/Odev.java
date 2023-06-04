package Practice;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // GetMethods
        //Amazon sayfasina gidelim. https://www.amazon.com//
       driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi --> " + driver.getTitle());
        Thread.sleep(3000);
        //Sayfa basliginin "Amazon" icerdigini test edin
          String actualtitle=driver.getTitle();
          String expectedtitle ="Amazon";
          if (actualtitle.contains(expectedtitle)){
              System.out.println("Test PASSED");
          }else {
              System.out.println("Test FAILED");
          }
        Thread.sleep(3000);

        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url -->" + driver.getCurrentUrl());


        //Sayfa url'inin "amazon" icerdigini test edin.
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl = "amazon";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test failed");
        }
        Thread.sleep(3000);
        // Sayfa handle degerini yazdirin
        System.out.println("Amazonun handle degeri --> " + driver.getWindowHandle());

        Thread.sleep(3000);

        // Sayfayi kapatin.
        driver.close();






    }
}
