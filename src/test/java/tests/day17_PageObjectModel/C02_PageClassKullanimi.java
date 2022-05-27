package tests.day17_PageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {
    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void test01() {
        // amazon a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // nutella aratalim
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // sonuc yazisinin nutella icerdigibi test edelim.
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="Nutella";
        Assert.assertTrue(actualSonuc.contains(arananKelime));






    }
}
