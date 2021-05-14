package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.ForgotPasswordPage;
import com.sparta.room1.pom.pages.interfaces.SignInPage;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPageImpl extends Page implements ForgotPasswordPage {

    private WebDriver driver;

    public ForgotPasswordPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public SignInPage goBackToSignInPage() {
        return null;
    }
}
