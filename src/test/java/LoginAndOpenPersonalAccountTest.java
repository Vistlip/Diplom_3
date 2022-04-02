import com.UserOperations;
import com.pages.HomePageBurger;
import com.pages.LoginPage;
import com.pages.PersonalAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static org.junit.Assert.assertTrue;

public class LoginAndOpenPersonalAccountTest {
    @Test
    public void LoginOpenPersonalAccount() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        UserOperations userOperations = new UserOperations();
        Map<String, String> responseData = new HashMap<>();
        responseData = userOperations.register();
        String email = responseData.get("email");
        String pass = responseData.get("password");
        System.out.println(responseData);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        homePageBurger.clickButtonPersonalAccount();
        PersonalAccountPage personalAccountPageVisible = page(PersonalAccountPage.class)
                .checkVisibleInformText();
        driver.close();
    }

    @Test
    public void LoginOpenPersonalAccountAndLogout() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        UserOperations userOperations = new UserOperations();
        Map<String, String> responseData = new HashMap<>();
        responseData = userOperations.register();
        String email = responseData.get("email");
        String pass = responseData.get("password");
        System.out.println(responseData);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        homePageBurger.clickButtonPersonalAccount();
        PersonalAccountPage personalAccountPage = page(PersonalAccountPage.class)
                .clickButtonLogout();
        loginPage.clickButtonLogin(); //проверка что видна кнопка войти
        driver.close();
    }

    @Test
    public void LoginOpenPersonalAccountYanex() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/yandexdriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        UserOperations userOperations = new UserOperations();
        Map<String, String> responseData = new HashMap<>();
        responseData = userOperations.register();
        String email = responseData.get("email");
        String pass = responseData.get("password");
        System.out.println(responseData);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        homePageBurger.clickButtonPersonalAccount();
        PersonalAccountPage personalAccountPageVisible = page(PersonalAccountPage.class)
                .checkVisibleInformText();
        driver.close();
    }

    @Test
    public void LoginOpenPersonalAccountAndLogoutYandex() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/yandexdriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        UserOperations userOperations = new UserOperations();
        Map<String, String> responseData = new HashMap<>();
        responseData = userOperations.register();
        String email = responseData.get("email");
        String pass = responseData.get("password");
        System.out.println(responseData);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        homePageBurger.clickButtonPersonalAccount();
        PersonalAccountPage personalAccountPage = page(PersonalAccountPage.class)
                .clickButtonLogout();
        loginPage.clickButtonLogin(); //проверка что видна кнопка войти
        driver.close();
    }


    @After
    public void deleteUser() {
        UserOperations userOperations = new UserOperations();
        userOperations.delete();
    }
}
