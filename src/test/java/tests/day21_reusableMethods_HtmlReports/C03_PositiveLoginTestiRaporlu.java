package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
public class C03_PositiveLoginTestiRaporlu extends TestBaseRapor {
    BrcPage brcPage=new BrcPage();
    @Test
    public void positiveLoginTest() {
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        //      login butonuna bas
        brcPage.ilkLoginButonu.click();
        extentTest.info("login butonuna tiklandi");
        // test data user email: customer@bluerentalcars.com ,
        ReusableMethods.waitFor(2);
        brcPage.emailBox.sendKeys(ConfigReader.getProperty("brcvalidemail"));
        extentTest.info("Gecerli email yazildi");
        // test data password : 12345
        ReusableMethods.waitFor(2);
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcvalidpassword"));
        extentTest.info("Gecerli password yazildi");
        // login butonuna tiklayin
        brcPage.ikinciLoginButonu.click();
        extentTest.info("login butonuna basildi");
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUsername= brcPage.kullaniciProfilIsmi.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUserName");
        Assert.assertEquals(actualUsername,expectedUsername);
        extentTest.pass("kullanici basarili sekilde giris yapti");

    }
}
