package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.OrderHistoryPage;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPageImpl extends Page implements OrderHistoryPage {

    private WebDriver driver;

    public OrderHistoryPageImpl(WebDriver driver) {
        this.driver = driver;
    }
}
