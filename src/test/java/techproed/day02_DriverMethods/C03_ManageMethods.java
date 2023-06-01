package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Browseri konumunu yazdiralim.
        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());

        //browseriin boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari =  " + driver.manage().window().getSize());

        //Browseri maximiz yapalim
        driver.manage().window().maximize();

        /*
        Bir web sitesine gittigimizde browser default olarak  bir boyutta gelir. VE acilan browserdaki
         webElementlere browser maximize olmadigi icin ulasamayabiliriz.Dolaysiyla browseriactiktan sonra
         maximize yaparsak driver butun webelementleri gorur ve rahatlikla mudahele edebilir.Bu yuzden browseri actiktan sonra
         driver.manage().window().maximize(); yapmamiz bizin webelemntlere ulasmada  isimiz kolaylastirir.Boylelikle fail almamis oluruz.

         */

        //Techproeducation sayfasini gidelim
        driver.get("https://techproeducation.com");

        //Browserin konumunu yazdiralim
        System.out.println("Sayfanin konumu = " + driver.manage().window().getPosition());

        //Browserin boyutlarini yazdiralim
        System.out.println("Sayfanin Boyutlari =  " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //sayfayi fullscreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50,50));//istediginiz kouma gotuuyor
        driver.manage().window().setSize(new Dimension(600,6000));//istedigimiz size verir
        //sayfayi kapatalim
        driver.close();




    }
}
