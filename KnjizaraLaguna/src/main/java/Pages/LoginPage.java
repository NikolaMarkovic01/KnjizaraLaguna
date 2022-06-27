package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePages {
    public LoginPage(ChromeDriver driver) {
        super(driver);
        driver.get("https://www.laguna.rs/");
        PageFactory.initElements(driver, this);
    }

    //Lokatori

    @FindBy(xpath = "//a[text()='Prijava']")
    WebElement prijavaField;

    @FindBy(xpath = "//input[@id='broj-f']")
    WebElement emaillField;

    @FindBy(xpath = "//input[@name='lozinka']")
    WebElement passwordField;

    @FindBy(xpath = "//a[@class='dugme-s']")
    WebElement prijavaButton;

    @FindBy(xpath = "//a[@class='btn btn-md btn-dark']")
    WebElement cookiesOff;

    @FindBy(xpath = "//a[@href='profil_clana.html']")
    WebElement nameOfMember;

    //Metode

    public void clickPrijavaField(){
        print("Metoda za klik na prijava polje");
        prijavaField.click();
    }

    public void clickEmailField(String text){
        print("Metoda za unos mail-a");
        emaillField.click();
        emaillField.sendKeys(text);
    }

    public void clickPasswordField(String text){
        print("Metoda za unos sifre");
        passwordField.click();
        passwordField.sendKeys(text);
    }

    public void clickPrijavaButton(){
        print("Metoda za klik na prijava dugme");
        prijavaButton.click();
    }

    public void clickCookiesOff(){
        print("Metoda za prihvatanje kolacica");
        cookiesOff.click();
    }

    public String getText(){
        print("Metoda za unos imena i prezimena");
        return nameOfMember.getText();
    }


}
