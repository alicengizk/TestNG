package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    BrcPage brcPage=new BrcPage();

    @Test
    public void yanlisSifre() {
        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brcPage.ilkLoginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailBox.sendKeys(ConfigReader.getProperty("brcvalidemail"));
        //test data password : 54321
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcinvalidpassword"));
        // Login butonuna basiniz
        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());
        Driver.closeDriver();
    }

    // bu class'da iki test methodu daha olusturun
    // 1. yanlis kullanici adi
    // 2. yanlis kullanici adi ve sifre girin
}
