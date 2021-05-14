package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.CreateAccountPage;
import org.openqa.selenium.WebDriver;

public class CreateAccountPageImpl extends Page implements CreateAccountPage {

    private WebDriver driver;

    public CreateAccountPageImpl(WebDriver driver) {
        this.driver = driver;
    }
}
