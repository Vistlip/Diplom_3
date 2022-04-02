package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageBurger {
    public static final String URL = Urls.StartPageURL;

    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement buttonPageLogin;
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    private SelenideElement buttonPersonalAccount;
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement buttonPageOrder;
    @FindBy(how = How.XPATH, using = ".//p[text()='Конструктор']")
    private SelenideElement buttonConstructor;
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement buttonLogo;
    @FindBy(how = How.XPATH, using = ".//h1[text()='Соберите бургер']")
    private SelenideElement textAssembleTheBurger;
    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
    private SelenideElement buttonSouse;
    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    private SelenideElement buttonBun;
    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
    private SelenideElement buttonFilling;
    @FindBy(how = How.XPATH, using = ".//p[text()='Соус Spicy-X']")
    private SelenideElement souseSpicyX;
    @FindBy(how = How.XPATH, using = ".//p[text()='Мясо бессмертных моллюсков Protostomia']")
    private SelenideElement fillingMeatProtostomia;
    @FindBy(how = How.XPATH, using = ".//p[text()='Флюоресцентная булка R2-D3']")
    private SelenideElement bunR2D3;

    public HomePageBurger() {
    }

    public HomePageBurger clickButtonPageLogin() {
        this.buttonPageLogin.click();
        return this;
    }

    public HomePageBurger clickButtonPageOrder() {
        this.buttonPageOrder.click();
        return this;
    }

    public HomePageBurger buttonPageOrderVisible() {
        this.buttonPageOrder.shouldBe(Condition.visible);
        return this;
    }

    public HomePageBurger clickButtonPersonalAccount() {
        this.buttonPersonalAccount.click();
        return this;
    }

    public HomePageBurger clickButtonConstructor() {
        this.buttonConstructor.click();
        return this;
    }

    public HomePageBurger clickLogo() {
        this.buttonLogo.click();
        return this;
    }

    public Boolean checkVisibleTextAssembleTheBurger() {
        return this.textAssembleTheBurger.isDisplayed();
    }

    public HomePageBurger clickSouse() {
        this.buttonSouse.click();
        return this;
    }

    public HomePageBurger clickFilling() {
        this.buttonFilling.click();
        return this;
    }

    public HomePageBurger clickBun() {
        this.buttonBun.click();
        return this;
    }

    public HomePageBurger checkVisibleSouse() {
        this.souseSpicyX.shouldBe(Condition.visible);
        return this;
    }

    public HomePageBurger checkVisibleFilling() {
        this.fillingMeatProtostomia.shouldBe(Condition.visible);
        return this;
    }

    public HomePageBurger checkVisibleBun() {
        this.bunR2D3.shouldBe(Condition.visible);
        return this;
    }

}
