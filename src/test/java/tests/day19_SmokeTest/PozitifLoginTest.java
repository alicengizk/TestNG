package tests.day19_SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {
    BrcPage brcPage = new BrcPage();

    @Test
    public void positiveLoginTest() {

        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brcPage.ilkLoginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailBox.sendKeys(ConfigReader.getProperty("brcvalidemail"));
        //test data password : 12345
        brcPage.passwordBox.sendKeys(ConfigReader.getProperty("brcvalidpassword"));
        // Login butonuna basiniz
        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUsername = brcPage.kullaniciProfilIsmi.getText();
        Assert.assertEquals(actualUsername,ConfigReader.getProperty("brcValidUserName"));
        Driver.closeDriver();


    }

}
