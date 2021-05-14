package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.ItemPage;
import com.sparta.room1.pom.pages.interfaces.PaymentConfirmationPage;
import com.sparta.room1.pom.pages.interfaces.PaymentPage;
import org.openqa.selenium.WebDriver;

public class PaymentPageImpl extends Page implements PaymentPage {

    private WebDriver driver;

    public PaymentPageImpl(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public ItemPage goToItemPage() {
        return null;
    }

    @Override
    public PaymentConfirmationPage payByBankWireButton() {
        return null;
    }

    @Override
    public PaymentConfirmationPage payByCheckButton() {
        return null;
    }
}
