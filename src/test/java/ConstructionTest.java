import com.POJO.HomePageBurger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;


public class ConstructionTest {
    @Test
    public void checkSouseVisible() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class)
                .clickSouse()
                .checkVisibleSouse()
                .clickFilling()
                .checkVisibleFilling()
                .clickBun()
                .checkVisibleBun();
        driver.close();
    }

    @Test
    public void checkSouseVisibleYandex() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/resoursers/yandexdriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        HomePageBurger homePageBurger = open(HomePageBurger.URL, HomePageBurger.class)
                .clickSouse()
                .checkVisibleSouse()
                .clickFilling()
                .checkVisibleFilling()
                .clickBun()
                .checkVisibleBun();
        driver.close();
    }


}
