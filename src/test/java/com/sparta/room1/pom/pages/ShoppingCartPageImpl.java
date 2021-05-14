package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.HomePage;
import com.sparta.room1.pom.pages.interfaces.ItemPage;
import com.sparta.room1.pom.pages.interfaces.ShoppingCartPage;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPageImpl extends Page implements ShoppingCartPage {

    private WebDriver driver;

    public ShoppingCartPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void increaseQuantity() {

    }

    @Override
    public void reduceQuantity() {

    }

    @Override
    public void enterQuantityNumber() {

    }

    @Override
    public void resetCart() {

    }

    @Override
    public void deleteItem() {

    }

    @Override
    public HomePage goBackToHomePage() {
        return null;
    }

    @Override
    public Page proceedToCheckout() {
        return null;
    }

    @Override
    public ItemPage goToItemPage() {
        return null;
    }
}
