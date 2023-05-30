package techproed.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle  sayfa basligini verir
        System.out.println("Amazonun Actual Title  : " + driver.getTitle());
        System.out.println("Amazon Actual url := " + driver.getCurrentUrl());
        String amazonWindowHandle= driver.getWindowHandle();
        System.out.println("Techproed Window handle degeri :" + driver.getWindowHandle());


        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation actual Title : " + driver.getTitle());//gettitle methodu sayfa basligini verir

        //getCurrentlyUrl()gidilen sayfanin url i verir
        System.out.println("Techproed actual url := " + driver.getCurrentUrl());

        //getpPageSource() Acilan sayfanin kodlarini verir
       // System.out.println( driver.getPageSource()); Bilerek yoruma aldik her calistirdimizda buun kaynak kodlrini gorecegimiz icin

        //getWindowHandle() Gidilen sayfanin handle degerini (hashkod) verir. Bu handle degerini sayfalar arasi gecis icn kullaniriz
        System.out.println("Techproed Window handle degeri :" + driver.getWindowHandle());//0CE04399F345247DC98C4924D4D812E4


    }

}
