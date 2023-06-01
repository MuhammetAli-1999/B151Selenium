package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class  C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20)) sayfadaki webelementleri gorunur olana kadar(sayfada olusana kadar )
        maximum 20 saniye bekler. eger webelementler 2 saniyede olusursa 2 saniye bekler ve alt sarira gcer.
         Fakat belirtiginiz max.sure boyunca internetten ya da sayfadan kaynakli olarak webelementler olusmazsa testimiz fail verir.
         thread.sleep() java kodlarini belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtisem 30 saniye bekler ve alt satira gecer
         */
        //techproed sayfasina git
          String amazonUrl="https://amazon.com";
          String techproUrl="https://techproeducation.com";
          driver.get(techproUrl);

        // amazona gidelim
          driver.get( amazonUrl);

        //techproed sayfasina geri donelim
        driver.navigate().back();

        //sayfa basligini Techpro icerdigini test edelim
        String actualTitle = driver.getTitle();
        String arananKelime= "Techpro";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED" + actualTitle);
        }

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basliginin Amazon icerdigini test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Tet PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //sayfayi kapatiniz
        driver.close();

    }

}
