package techproed.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda sysytem ozellikklerini ayarlamak icin setProperty methodu kullaniriz
        //setProperty ile  methodu ile claasiinmiza driverin fiziki yolunu belirtriz
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile Key degerini girerek value ulasabilirim
        WebDriver driver= new ChromeDriver();
        // ChromeDriver turunde yeni bir obje olusturduk
        driver.get("htts://techproeducation.com");
        //get() methodu ile String olarak girilen url gideriz






    }

}
