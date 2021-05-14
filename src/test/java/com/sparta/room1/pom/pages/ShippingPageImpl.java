package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.PaymentPage;
import com.sparta.room1.pom.pages.interfaces.ShippingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPageImpl extends Page implements ShippingPage {

    private WebDriver driver;
    private By termsOfService = By.linkText("(Read the Terms of Service)");

    public ShippingPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doesTermsOfServiceShow() {
        String termsOfServiceText = driver.findElement(termsOfService).getText();
        return termsOfServiceText.contains("http://automationpractice.com/index.php?id_cms=3&controller=cms&content_only=1");
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
