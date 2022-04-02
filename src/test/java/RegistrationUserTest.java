import com.pages.LoginPage;
import com.pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static org.junit.Assert.assertTrue;

public class RegistrationUserTest {
    public static final String EMAIL_POSTFIX = "@yandex.ru";
    String json;
    @Test
    public void registrationNewUserYandex() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/yandexdriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        String email = RandomStringUtils.randomAlphabetic(10) + EMAIL_POSTFIX;
        // с помощью библиотеки RandomStringUtils генерируем пароль
        String password = RandomStringUtils.randomAlphabetic(10);
        // с помощью библиотеки RandomStringUtils генерируем имя пользователя
        String name = RandomStringUtils.randomAlphabetic(10);
        // создаём и заполняем мапу для передачи трех параметров в тело запроса
        RegistrationPage registrationPage =
                open(RegistrationPage.URL, RegistrationPage.class);
        registrationPage.setNameForRegistration(name)
                .setEmailForRegistration(email)
                .setPassForRegistration(password);
        registrationPage.clickButtonRegistration();
        LoginPage loginPageVisible = page(LoginPage.class)
                .checkButtonEnterVisible();
        driver.close();
    }

    @Test
    public void registrationNewUserIncorrectPasswordYandex() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/yandexdriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        String email = RandomStringUtils.randomAlphabetic(10) + EMAIL_POSTFIX;
        // с помощью библиотеки RandomStringUtils генерируем пароль
        String password = RandomStringUtils.randomAlphabetic(10);
        // с помощью библиотеки RandomStringUtils генерируем имя пользователя
        String name = RandomStringUtils.randomAlphabetic(10);
        // создаём и заполняем мапу для передачи трех параметров в тело запроса
        RegistrationPage registrationPage =
                open(RegistrationPage.URL, RegistrationPage.class);
        registrationPage.setNameForRegistration(name)
                .setEmailForRegistration(email)
                .setPassForRegistration("123")
                .clickButtonRegistration()
                .checkPassIncorrect();
        driver.close();
    }

    @Test
    public void registrationNewUser() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        String email = RandomStringUtils.randomAlphabetic(10) + EMAIL_POSTFIX;
        // с помощью библиотеки RandomStringUtils генерируем пароль
        String password = RandomStringUtils.randomAlphabetic(10);
        // с помощью библиотеки RandomStringUtils генерируем имя пользователя
        String name = RandomStringUtils.randomAlphabetic(10);
        // создаём и заполняем мапу для передачи трех параметров в тело запроса
        RegistrationPage registrationPage =
                open(RegistrationPage.URL, RegistrationPage.class);
        registrationPage.setNameForRegistration(name)
                .setEmailForRegistration(email)
                .setPassForRegistration(password);
        registrationPage.clickButtonRegistration();
        LoginPage loginPageVisible = page(LoginPage.class)
                .checkButtonEnterVisible();
        driver.close();
    }

    @Test
    public void registrationNewUserIncorrectPassword() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        String email = RandomStringUtils.randomAlphabetic(10) + EMAIL_POSTFIX;
        // с помощью библиотеки RandomStringUtils генерируем пароль
        String password = RandomStringUtils.randomAlphabetic(10);
        // с помощью библиотеки RandomStringUtils генерируем имя пользователя
        String name = RandomStringUtils.randomAlphabetic(10);
        // создаём и заполняем мапу для передачи трех параметров в тело запроса
        RegistrationPage registrationPage =
                open(RegistrationPage.URL, RegistrationPage.class);
        registrationPage.setNameForRegistration(name)
                .setEmailForRegistration(email)
                .setPassForRegistration("123")
                .clickButtonRegistration()
                .checkPassIncorrect();
        driver.close();
    }

}
