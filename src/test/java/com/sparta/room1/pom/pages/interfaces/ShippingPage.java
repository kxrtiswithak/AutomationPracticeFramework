package com.sparta.room1.pom.pages.interfaces;

public interface ShippingPage extends Page {

    boolean doesTermsOfServiceShow();

    boolean doesNotProceedToCheckoutWhenTosUnticked();

    PaymentPage proceedToCheckout();

    AddressPage continueShoppingButton();
}
