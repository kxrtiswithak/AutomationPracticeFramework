package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.OrderConfirmationPage;
import com.sparta.room1.pom.pages.interfaces.PaymentConfirmationPage;
import com.sparta.room1.pom.pages.interfaces.PaymentPage;
import org.openqa.selenium.WebDriver;

public class PaymentConfirmationPageImpl extends Page implements PaymentConfirmationPage {

    private WebDriver driver;

    public PaymentConfirmationPageImpl(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public PaymentPage goBackToPaymentPage() {
        return null;
    }

    @Override
    public OrderConfirmationPage confirmOrderButton() {
        return null;
    }
}
