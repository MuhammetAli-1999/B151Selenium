package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Techpro sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile ayni mantikta calisir
        Thread.sleep(3000);//Java kodlarini bekletmek icin Thread.sleep kullanabiliriz

        //Sonra amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasinin basligini yazdiralim
        System.out.println("Amazon sayfa Basligi-->" + driver.getTitle());
        Thread.sleep(3000);

        //Techproeducation sayfasini geri donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //sayfa basligini yazdiralim
        System.out.println("Techproeducation sayfa basligi->" + driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasina tekrar gidip url i yazdiralim
        driver.navigate().forward();
        System.out.println("amazon sayfai url ->" + driver.getCurrentUrl());
        Thread.sleep(3000);

        //amazon sayfasindayken sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //sayfayi kapatalim
        driver.close();



    }
}
