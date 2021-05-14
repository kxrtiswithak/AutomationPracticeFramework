package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.ItemPage;
import com.sparta.room1.pom.pages.interfaces.ShoppingCartPage;
import org.openqa.selenium.WebDriver;

public class ItemPageImpl extends Page implements ItemPage {

    private WebDriver driver;

    public ItemPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ShoppingCartPage goBackToShoppingCartPage() {
        return null;
    }
}
