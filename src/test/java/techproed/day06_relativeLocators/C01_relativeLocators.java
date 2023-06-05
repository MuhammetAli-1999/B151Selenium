package techproed.day06_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);


        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //Webelementlerin yazısını konsola yazdıralım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());

        //Bikes altindaki tum linkleri (webelement) konsola yazdiralim
        List<WebElement> linklerlistesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));

        /*

        XPATH kullaniminda bir sayfadaki webelemntleri
        mudahele etmek istedigimizde xpath ile locate aldigimizda birden fazla sonuc verebilir.
        [position()>=10 and position()<=16]"))--> bu kullanimla aralik belirterek istedigimiz web secip mudahele eder
                 */


        //lambda ile yazdirdik
        linklerlistesi.forEach(t -> System.out.println(t.getText()));
        System.out.println("**************************************");

        for (WebElement w : linklerlistesi) {
            System.out.println(w.getText());
        }

        //Bu linklerinlerin hepsini tiklayalim ve sayfa basliklarini alalim

        for (int i = 0; i < linklerlistesi.size(); i++) {
            for (i = 0; i < linklerlistesi.size(); i++) {
                linklerlistesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
                System.out.println(linklerlistesi.get(i).getText());
                linklerlistesi.get(i).click();
                Thread.sleep(3000);
                driver.navigate().back();
                Thread.sleep(3000);
            }



            //completeBike.click();
        }
    }
}

