package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.PaymentPage;
import com.sparta.room1.pom.pages.interfaces.ShippingPage;
import org.openqa.selenium.WebDriver;

public class ShippingPageImpl extends Page implements ShippingPage {

    private WebDriver driver;

    public ShippingPageImpl(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public boolean doesTermsOfServiceShow() {
        return false;
    }

    @Override
    public boolean doesNotProceedToCheckoutWhenTosUnticked() {
        return false;
    }

    @Override
    public PaymentPage proceedToCheckout() {
        return null;
    }

    @Override
    public AddressPage continueShoppingButton() {
        return null;
    }
}
