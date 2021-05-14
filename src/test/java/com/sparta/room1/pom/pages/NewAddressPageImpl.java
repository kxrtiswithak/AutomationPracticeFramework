package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.Page;
import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.NewAddressPage;
import org.openqa.selenium.WebDriver;

public class NewAddressPageImpl extends Page implements NewAddressPage {

    private WebDriver driver;

    public NewAddressPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public AddressPage goBackToAddressPage() {
        return null;
    }
}
