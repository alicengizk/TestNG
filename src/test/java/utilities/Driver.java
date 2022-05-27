package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    /*
    POM'de Driver icin TestBase Class'ina extends etmek yerine
    Driver Class'indan static method'lar kullanarak
    Driver olusuturup, ilgili ayarlarin yapilmasi
    ve en sonda Driver'in kapatilmasi tercih edilmistir.
     */

   static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver!=null) {  // driver'a deger atanmissa
            driver.close();
            driver=null;
        }

    }

}
