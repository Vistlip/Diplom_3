package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    public static final String URL = Urls.LoginPageURL;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input")
    private SelenideElement inputLogin;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input")
    private SelenideElement inputPass;
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement clickButtonLogin;


    public LoginPage() {
    }

    public LoginPage clickButtonLogin() {
        this.clickButtonLogin.click();
        return this;
    }

    public LoginPage checkButtonEnterVisible() {
        this.clickButtonLogin.shouldBe(Condition.visible);
        return this;
    }

    public LoginPage setEmailForLogin(String email) {
        this.inputLogin.setValue(email);
        return this;
    }

    public LoginPage setPassForLogin(String pass) {
        this.inputPass.setValue(pass);
        return this;
    }

}

