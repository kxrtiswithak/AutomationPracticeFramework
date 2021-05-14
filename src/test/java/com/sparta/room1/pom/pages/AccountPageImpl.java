package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.AccountPage;
import com.sparta.room1.pom.pages.interfaces.SignInPage;
import org.openqa.selenium.WebDriver;

public class AccountPageImpl extends Page implements AccountPage{

    private WebDriver driver;

    public AccountPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public SignInPage goBackToSignInPage() {
        return null;
    }

}
