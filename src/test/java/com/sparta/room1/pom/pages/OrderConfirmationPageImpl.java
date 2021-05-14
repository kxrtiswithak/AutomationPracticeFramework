package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.OrderConfirmationPage;
import com.sparta.room1.pom.pages.interfaces.OrderHistoryPage;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPageImpl extends Page implements OrderConfirmationPage {

    private WebDriver driver;

    public OrderConfirmationPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public OrderHistoryPage backToOrdersButton() {
        return null;
    }
}
