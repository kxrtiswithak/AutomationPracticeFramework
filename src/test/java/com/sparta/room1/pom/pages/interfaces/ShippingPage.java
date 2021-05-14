package com.sparta.room1.pom.pages.interfaces;

import com.sparta.room1.pom.pages.Page;

public interface ShippingPage {

    boolean doesTermsOfServiceShow();

    boolean doesNotProceedToCheckoutWhenTosUnticked();

    PaymentPage proceedToCheckout();

    AddressPage continueShoppingButton();
}
