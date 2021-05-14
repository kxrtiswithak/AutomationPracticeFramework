package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.HomePage;
import com.sparta.room1.pom.pages.interfaces.ShoppingCartPage;
import org.openqa.selenium.WebDriver;

public class HomePageImpl extends Page implements HomePage {

    private WebDriver driver;

    public HomePageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public ShoppingCartPage goToShoppingCartPage() {
        return null;
    }

    @Override
    public void addToCart() {

    }
}
