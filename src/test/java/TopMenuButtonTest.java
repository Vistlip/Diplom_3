import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static org.junit.Assert.assertTrue;

public class TopMenuButtonTest {

    @Test
    public void checkButtonConstructor() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        homePageBurger.clickButtonConstructor();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .checkVisibleTextAssembleTheBurger();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void checkButtonLogo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        homePageBurger.clickLogo();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .checkVisibleTextAssembleTheBurger();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void checkButtonConstructorYandex() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/yandexdriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        homePageBurger.clickButtonConstructor();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .checkVisibleTextAssembleTheBurger();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }

    @Test
    public void checkButtonLogoYandex() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/yandexdriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class);
        homePageBurger.clickButtonPageLogin();
        homePageBurger.clickLogo();
        Thread.sleep(1000); //Без него падает проверка видимости
        Boolean isVisibleHomePageBurger = page(HomePageBurger.class)
                .checkVisibleTextAssembleTheBurger();
        assertTrue("Not visible home page", isVisibleHomePageBurger);
        driver.close();
    }
}
