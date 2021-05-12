package com.sparta.room1.pom.pages.interfaces;

public interface PaymentPage extends Page {

    // differentiate between image and title (overloading, params)
    ItemPage goToItemPage();

    // different implementation to pay by check button
    PaymentConfirmationPage payByBankWireButton();

    PaymentConfirmationPage payByCheckButton();
}
