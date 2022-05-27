package tests.day17_PageObjectModel;

import com.github.javafaker.Faker;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {

    FacebookPage facebookPage = new FacebookPage();
    Faker faker = new Faker();

    @Test
    public void test01() {

        // facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");
        // cikarsa cookies kabul edin
        // kullanici mail kutusuna rastgele bir isim yazdirin
        facebookPage.mailKutusu.sendKeys(faker.name().firstName());
        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());
        // login butonuna basin
        facebookPage.loginTusu.click();
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();


    }
}
