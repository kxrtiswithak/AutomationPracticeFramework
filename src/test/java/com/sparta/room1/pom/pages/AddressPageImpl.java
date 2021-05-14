package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.NewAddressPage;
import com.sparta.room1.pom.pages.interfaces.ShippingPage;
import com.sparta.room1.pom.pages.interfaces.ShoppingCartPage;
import org.openqa.selenium.WebDriver;

public class AddressPageImpl extends Page implements AddressPage {

    private WebDriver driver;

    public AddressPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void selectExistingDeliveryAddress() {

    }

    @Override
    public boolean isBillingAddressDeliveryAddressWhenTicked() {
        return false;
    }

    @Override
    public void selectExistingBillingAddress() {

    }

    @Override
    public NewAddressPage addNewAddressButton() {
        return null;
    }

    @Override
    public NewAddressPage addNewBillingAddressButton() {
        return null;
    }

    @Override
    public NewAddressPage updateDeliveryAddressButton() {
        return null;
    }

    @Override
    public NewAddressPage updateBillingAddressButton() {
        return null;
    }

    @Override
    public boolean textAreaWorks(String text) {
        return false;
    }

    @Override
    public ShoppingCartPage continueShoppingButton() {
        return null;
    }

    @Override
    public ShippingPage proceedToCheckout() {
        return null;
    }
}
