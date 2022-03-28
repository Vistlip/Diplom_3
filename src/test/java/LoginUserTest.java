import com.POJO.ForgotPassPage;
import com.POJO.HomePageBurger;
import com.POJO.LoginPage;
import com.POJO.RegistrationPage;
import com.UserOperations;
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

public class LoginUserTest {
    @Test
    public void LoginFromHomePage() throws InterruptedException {
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
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void LoginFromPersonalAccount() throws InterruptedException {
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
        homePageBurger.clickButtonPersonalAccount();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void LoginFromRegistrationPage() throws InterruptedException {
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
        RegistrationPage registrationPage = open(RegistrationPage.URL, RegistrationPage.class);
        registrationPage.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void LoginFromForgotPassPage() throws InterruptedException {
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
        ForgotPassPage forgotPassPage = open(ForgotPassPage.URL, ForgotPassPage.class);
        forgotPassPage.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void LoginFromHomePageYandex() throws InterruptedException {
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
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void LoginFromPersonalAccountYandex() throws InterruptedException {
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
        homePageBurger.clickButtonPersonalAccount();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void LoginFromRegistrationPageYandex() throws InterruptedException {
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
        RegistrationPage registrationPage = open(RegistrationPage.URL, RegistrationPage.class);
        registrationPage.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void LoginFromForgotPassPageYandex() throws InterruptedException {
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
        ForgotPassPage forgotPassPage = open(ForgotPassPage.URL, ForgotPassPage.class);
        forgotPassPage.clickButtonPageLogin();
        LoginPage loginPage = page(LoginPage.class);
        loginPage.setEmailForLogin(email)
                .setPassForLogin(pass)
                .clickButtonLogin();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .buttonPageOrderVisible();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }


    @After
    public void deleteUser() {
        UserOperations userOperations = new UserOperations();
        userOperations.delete();
    }

}
