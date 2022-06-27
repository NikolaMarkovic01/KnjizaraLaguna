import Pages.BasePages;
import Pages.InventoryPages;
import Pages.Strings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest {

    /*Add one book in shopping cart
    1.Login with valid credentials
    2.Enter name of book ("Rat svetova")
    3.Click search field
    4.Navigate to Inventory page
    5.Click Rat svetova book
    6.Click "dodaj u korpu" button
     */

    @Test
    public void addOneBookInShoppingCart(){
        ChromeDriver driver = openChromeDriver();
        try {
            loginWithValidCredentials(driver);
            print("Navigate to Base Page");
            BasePages basePages = new BasePages(driver);
            print("Search book Rat svetova");
            basePages.enterTextField(Strings.SEARCH_BOOK_ONE);
            print("Click search button");
            basePages.clickSearchButton();
            print("Navigate to Inventory page");
            InventoryPages inventoryPages = new InventoryPages(driver);
            print("Click on Rat svetova book");
            inventoryPages.clickRatSvetovaBook();
            print("Click on dodaj u korpa button");
            inventoryPages.clickDodajUKorpuButton();
            String actualNumberFromShoppingBasket= basePages.getNumber();
            print("Verify that number of book in shopping basket are 1");
            assert actualNumberFromShoppingBasket.equals(Strings.WALID_NUMBER_IN_SHOPPING_BASKET):"Wrong number in shopping basket. Expected: " + Strings.WALID_NUMBER_IN_SHOPPING_BASKET + "Actual:" + actualNumberFromShoppingBasket;


        }
        finally {
            driver.quit();
        }
    }

        /*Search in Search field
        1.Login with valid credentials
        2.Enter wrong book title
        3.Click search button
        */

    @Test
    public void searchField(){
        ChromeDriver driver = openChromeDriver();
        try {
            loginWithValidCredentials(driver);
            print("Navigate to Base Page");
            BasePages basePages = new BasePages(driver);
            print("Enter wrong title");
            basePages.enterTextField(Strings.WRONG_TITLE);
            print("Click loop icon");
            basePages.clickSearchButton();
            print("Verify that browser have correct URL adress");
            assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_URL): "Wrong URL Expected" + Strings.INVENTORY_PAGE_URL + "Actual: " + driver.getCurrentUrl();

        }
        finally {
            driver.quit();
        }
    }

        /*Delete book from shopping chart
        1.Click on book menu
        2.click on side book menu
        3.Click on Purpur imperie book
        4.Click dodaj u korpu
        5.Click korpa button
        6.Click izbrisi iz korpe button
        7.Click OK on message are you sure
         */

    @Test
    public void deleteFromShoppingChart(){
        ChromeDriver driver = openChromeDriver();
        try{
            loginWithValidCredentials(driver);
            print("Naviagate to Inventory page");
            InventoryPages inventoryPages = new InventoryPages(driver);
            print("naviagte to Base Page");
            BasePages basePages = new BasePages(driver);
            print("Click book menu");
            inventoryPages.clickBookField();
            print("Click side bare menu");
            inventoryPages.clickSideField();
            print("Click on Purpur imperie book");
            inventoryPages.clickImperiaBook();
            print("Click dodaj u korpu button");
            inventoryPages.clickEnterInBasket();
            print("Click korpa button");
            inventoryPages.clickSeeInBasket();
            print("Click izbrisi iz korpe button");
            inventoryPages.clickDeleteFromBasket();
            print("Click OK on message");
            inventoryPages.clickAreYouSure();
            print("Verify that browser have correct URL adress");
            assert driver.getCurrentUrl().equals(Strings.INVENTORY_PAGE_URL_ONE): "Wrong URL Expected" + Strings.INVENTORY_PAGE_URL_ONE + "Actual: " + driver.getCurrentUrl();

        }
        finally {
            driver.quit();
        }
    }


}
