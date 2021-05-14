package com.sparta.room1.pom.pages.interfaces;

import com.sparta.room1.pom.pages.Page;

public interface PaymentPage  {

    // differentiate between image and title (overloading, params)
    ItemPage goToItemPage();

    // different implementation to pay by check button
    PaymentConfirmationPage payByBankWireButton();

    PaymentConfirmationPage payByCheckButton();
}
