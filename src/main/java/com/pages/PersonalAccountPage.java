package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalAccountPage {
    public static final String URL = Urls.ProfilePageURL;

    @FindBy(how = How.XPATH, using = ".//p[text()='В этом разделе вы можете изменить свои персональные данные']")
    private SelenideElement informTextAboutChangeData;
    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private SelenideElement buttonLogout;

    public PersonalAccountPage clickButtonLogout() {
        this.buttonLogout.click();
        return this;
    }

    public PersonalAccountPage checkVisibleInformText() {
        this.informTextAboutChangeData.shouldBe(Condition.visible);
        return this;
    }
}
