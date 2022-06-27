import Pages.LoginPage;
import Pages.Strings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BaseTest {
    ChromeDriver openChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--start-maximized"});
        options.addArguments(new String[]{"--incognito"});
        ChromeDriver driver = new ChromeDriver(options);
        return driver;
    }

    public void loginWithValidCredentials(ChromeDriver driver) {
        print("Navigate to Login Page");
        LoginPage loginPage = new LoginPage(driver);
        print("Click Accept cookies");
        loginPage.clickCookiesOff();
        print("Click on prijava field");
        loginPage.clickPrijavaField();
        print("Click email field");
        loginPage.clickEmailField(Strings.CORRECT_USER_NUMBER);
        print("Click password field");
        loginPage.clickPasswordField(Strings.CORRECT_USER_Password);
        print("Click prijava button");
        loginPage.clickPrijavaButton();
    }

    public void print(String s) {
        System.out.println(s);
    }
}

