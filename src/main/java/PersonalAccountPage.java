import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalAccountPage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/account/profile";

    @FindBy(how = How.XPATH, using = ".//p[text()='В этом разделе вы можете изменить свои персональные данные']")
    private SelenideElement informTextAboutChangeData;
    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private SelenideElement buttonLogout;

    public Boolean checkVisibleInformText() {
        return this.informTextAboutChangeData.isDisplayed();
    }

    public PersonalAccountPage clickButtonLogout() {
        this.buttonLogout.click();
        return this;
    }
}
