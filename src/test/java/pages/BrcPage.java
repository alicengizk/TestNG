package pages;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='/login']")
    public WebElement ilkLoginButonu;

    @FindBy (id = "formBasicEmail")
    public WebElement emailBox;

    @FindBy (id = "formBasicPassword")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement ikinciLoginButonu;

    @FindBy (id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;

    @FindBy ()
    public WebElement emailTextBox;

    @FindBy ()
    public WebElement passwordTextBox;


}
