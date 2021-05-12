package com.sparta.room1.pom.pages.interfaces;

public interface PaymentConfirmationPage extends Page {

    PaymentPage goBackToPaymentPage();

    OrderConfirmationPage confirmOrderButton();
}
