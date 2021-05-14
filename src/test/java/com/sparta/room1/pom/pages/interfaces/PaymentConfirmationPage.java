package com.sparta.room1.pom.pages.interfaces;

import com.sparta.room1.pom.pages.Page;

public interface PaymentConfirmationPage {

    PaymentPage goBackToPaymentPage();

    OrderConfirmationPage confirmOrderButton();
}
