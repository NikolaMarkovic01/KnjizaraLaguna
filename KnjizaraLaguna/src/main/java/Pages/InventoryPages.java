package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

        //Konstruktor
public class InventoryPages extends BasePages {
    public InventoryPages(ChromeDriver driver) {
        super(driver);
        driver.get("https://www.laguna.rs/pretraga-laguna-rat-svetova-str-1.html");
        PageFactory.initElements(driver, this);
    }


    //Lokatori
    @FindBy(xpath = "//img[@alt='rat svetova laguna knjige']")
    WebElement ratSvetovaBook;

    @FindBy(xpath = "//a[@class='dugme dugme-crveno']")
    WebElement dodajUKorpuButton;

    @FindBy(xpath = "//li//a[text()='Knjige']")
    WebElement bookField;

    @FindBy(xpath = "//a[@title='istorija laguna knjige']")
    WebElement sideField;

    @FindBy(xpath = "//div[@class='knjiga']//a[@title='purpur imperije laguna knjige']")
    WebElement imperiaBook;

    @FindBy(xpath = "//a[@id='dugme-korpa']")
    WebElement enterInBasket;

    @FindBy(xpath = "//a[@id='korpa_broj']")
    WebElement seeInBasket;

    @FindBy(xpath = "//a[@class='dugme dugme-crveno korpa-brisanje']")
    WebElement deleteFromBasket;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement areYouSure;



    //Metode

    public void clickRatSvetovaBook(){
        print("Metoda za odabir knjige Rat svetova");
        ratSvetovaBook.click();
    }

    public void clickDodajUKorpuButton(){
        print("Metoda za klik na dugme dodaj u korpu");
        dodajUKorpuButton.click();
    }

    public void clickBookField(){
        print("Metoda za odabir polja za pretragu knjige");
        bookField.click();

    }

    public void clickSideField(){
        print("Metoda za odabir bocnog menija");
        sideField.click();
    }

    public void clickImperiaBook(){
        print("Metoda za odabir knjige Purpur imperije");
        imperiaBook.click();

    }

    public void clickEnterInBasket(){
        print("Metoda za ubacivanje knjige u korpu");
        enterInBasket.click();
    }

    public void clickSeeInBasket(){
        print("Metoda za ulazak u korpu");
        seeInBasket.click();
    }

    public void clickDeleteFromBasket(){
        print("Metoda za brisanje iz korpe");
        deleteFromBasket.click();
    }

    public void clickAreYouSure(){
        print("Metoda za potvrdu brisanja knjige iz korpe");
        areYouSure.click();
    }
   }
