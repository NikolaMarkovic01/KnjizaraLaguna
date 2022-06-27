import Pages.BasePages;
import Pages.LoginPage;
import Pages.Strings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    /* Login with wrong credebtials
    1.Navigate to Base Page(Laguna home page)
    2.Click cookies OK (Slazem se)
    3.Click "Prijava" field
    4.Navigate to Login page
    5.Click "Korisnicki broj" field
    6.Enter invalid korisnicki broj
    7.Click "Lozinka" field
    8.Enter invalid lozinka
    9.Click "Prijava" button
    10.Return to Base Page
     */

    @Test
    public void WrongCredentials(){
        ChromeDriver driver = openChromeDriver();

        try{
            print("Navigate to Login Page");
            LoginPage loginPage = new LoginPage(driver);
            print("Click to Accept cookie");
            loginPage.clickCookiesOff();
            print("Click to Prijava field");
            loginPage.clickPrijavaField();
            print("Enter wrong email");
            loginPage.clickEmailField(Strings.WRONG_EMAIL);
            print("Enter wrong password");
            loginPage.clickPasswordField(Strings.WRONG_PASSWORD);
            print("Click on Prijava button");
            loginPage.clickPrijavaButton();
            print("Navigate to Base Page");
            BasePages basePages = new BasePages(driver);
            String actualTextFromPrijavaField=basePages.getText();
            print("Verify that the login with wrong credential");
            assert actualTextFromPrijavaField.equals(Strings.PRIJAVA_FIELD_TEXT):"Wrong text Expected" + Strings.PRIJAVA_FIELD_TEXT + "Actual:" + actualTextFromPrijavaField;
        }
        finally {
             driver.quit();
        }
    }

    /*Login with invalid credentials
    1.Navigate to Base page(Laguna home page)
    2.Click cookies OK (Slazem se)
    3.Click "Prijava" field
    4.Navigate to Login page
    5.Click "Korisnicki broj" field
    6.Enter valid korisnicki broj
    7.Click "Lozinka" field
    8.Enter valid lozinka
    9.Click "Prijava" button
    10.Return to Base page
     */

    @Test
    public void SuccessfullyLogIn(){
        ChromeDriver driver = openChromeDriver();
        try{
            print("Navigate to Login page");
            LoginPage loginPage = new LoginPage(driver);
            print("Click to Accept cookie");
            loginPage.clickCookiesOff();
            print("Click to Prijava field");
            loginPage.clickPrijavaField();
            print("Enter correct user number");
            loginPage.clickEmailField(Strings.CORRECT_USER_NUMBER);
            print("Enter vorrect password");
            loginPage.clickPasswordField(Strings.CORRECT_USER_Password);
            print("Click on Prijava button");
            loginPage.clickPrijavaButton();
            String actualNameOfMember=loginPage.getText();
            print("Verify that user (Nikola Markovic) login correctly");
            assert actualNameOfMember.equals(Strings.NAME_OF_MEMBER):"Wrong name.Expected" + Strings.NAME_OF_MEMBER + "Actual: " + actualNameOfMember;
        }
        finally {
             driver.quit();
        }
    }

}
