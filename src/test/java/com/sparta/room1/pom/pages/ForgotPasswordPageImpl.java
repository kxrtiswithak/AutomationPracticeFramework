package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.ForgotPasswordPage;
import com.sparta.room1.pom.pages.interfaces.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPageImpl extends Page implements ForgotPasswordPage {

    private WebDriver driver;

    public ForgotPasswordPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    private By backToLogin = new By.ByLinkText("Back to Login");

    @Override
    public SignInPage goBackToLogin() {

        driver.findElement(backToLogin).click();

        return new SignInPageImpl(driver);
    }
}