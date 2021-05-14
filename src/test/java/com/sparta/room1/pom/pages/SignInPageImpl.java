package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.AccountPage;
import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.ForgotPasswordPage;
import com.sparta.room1.pom.pages.interfaces.SignInPage;
import org.openqa.selenium.WebDriver;

public class SignInPageImpl extends Page implements SignInPage {

    private WebDriver driver;

    public SignInPageImpl(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public AccountPage createAccount(String email) {
        return null;
    }

    @Override
    public AddressPage signIn(String email, String password) {
        return null;
    }

    @Override
    public ForgotPasswordPage goToForgetPassword() {
        return null;
    }
}
