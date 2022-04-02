package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
    public static final String URL = Urls.RegistrationPageURL;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input")
    private SelenideElement inputName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input")
    private SelenideElement inputEmail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/form/fieldset[3]/div/div/input")
    private SelenideElement inputPass;
    @FindBy(how = How.XPATH, using = ".//button[text()='Зарегистрироваться']")
    private SelenideElement buttonRegistration;
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement buttonPageLogin;
    @FindBy(how = How.XPATH, using = ".//p[text()='Некорректный пароль']")
    private SelenideElement passIncorrect;

    public RegistrationPage() {
    }

    public RegistrationPage clickButtonRegistration() {
        this.buttonRegistration.click();
        return this;
    }

    public RegistrationPage clickButtonPageLogin() {
        this.buttonPageLogin.click();
        return this;
    }

    public RegistrationPage setNameForRegistration(String name) {
        this.inputName.setValue(name);
        return this;
    }

    public RegistrationPage setEmailForRegistration(String email) {
        this.inputEmail.setValue(email);
        return this;
    }

    public RegistrationPage setPassForRegistration(String pass) {
        this.inputPass.setValue(pass);
        return this;
    }

    public RegistrationPage checkPassIncorrect() {
        this.passIncorrect.shouldBe(Condition.visible);
        return this;
    }


}
