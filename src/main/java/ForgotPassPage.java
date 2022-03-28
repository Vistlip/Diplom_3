package com.POJO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPassPage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/forgot-password";

    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement buttonPageLogin;
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    private SelenideElement buttonPersonalAccount;
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement buttonPageOrder;


    public ForgotPassPage() {
    }

    public ForgotPassPage clickButtonPageLogin() {
        this.buttonPageLogin.click();
        return this;
    }
}
