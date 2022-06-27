package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePages {
    ChromeDriver driver = null;

    //Konstruktor

    public BasePages(ChromeDriver driver){
        driver.get("https://www.laguna.rs/");
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void print(String s) {
        System.out.println(s);
    }


    //Lokatori

    @FindBy(xpath = "//input[@id='pretraga_rec']")
    WebElement searchField;

    @FindBy(xpath = "//input[@value='Pretraži']")
    WebElement searchButton;

    @FindBy(xpath = "//a[@href='prijava.html']")
    WebElement prijavaField;

    @FindBy(xpath = "//a[@id='korpa_broj']")
    WebElement numberShoppingBasket;

    //Metode

    public void enterTextField(String text){
        print("Metoda za unos teksta");
        searchField.click();
        searchField.sendKeys(text);
    }

    public void clickSearchButton(){
        print("Metoda za klik na pretraga dugme");
        searchButton.click();
    }

    public String getText(){
        print("Metoda za uzimanje teksta");
        return prijavaField.getText();

    }

    public String getNumber(){
        print("Metoda za uzimanje broja");
        return numberShoppingBasket.getText();
    }

  }
