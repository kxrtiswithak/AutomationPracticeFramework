package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.HomePage;
import com.sparta.room1.pom.pages.interfaces.ItemPage;
import com.sparta.room1.pom.pages.interfaces.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ShoppingCartPageImpl extends Page implements ShoppingCartPage {

    private WebDriver driver;
    private HomePage homePage;

    private By increaseQuantityButton = new By.ByClassName("cart_quantity_up");
    private By reduceQuantityButton = new By.ByClassName("cart_quantity_down");
    private By quantityInputField = new By.ByClassName("cart_quantity_input");
    private By deleteCartButton = new By.ByClassName("cart_quantity_delete");
    private By continueShoppingButton = new By.ByClassName("button-exclusive");
    private By proceedToCheckoutButton = new By.ByClassName("standard-checkout");
    private By itemImage = new By.ByCssSelector("td.cart_product img");
    private By itemTitle = new By.ByCssSelector("td.cart_description > .product-name > a");
    private By itemDescription = new By.ByPartialLinkText("Color : ");
    private By signInButton = new By.ByClassName("login");

    public ShoppingCartPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void increaseQuantity() {
        driver.findElement(increaseQuantityButton).click();
    }

    @Override
    public void reduceQuantity() {
        driver.findElement(reduceQuantityButton).click();
    }

    @Override
    public void enterQuantityNumber(String quantityNumber) {
        driver.findElement(quantityInputField).sendKeys(quantityNumber);
    }

    @Override
    public void resetCart() {
        deleteItem();
        homePage = continueShopping();
        homePage.addToCart();
        homePage.goToShoppingCartPage();
    }

    @Override
    public void deleteItem() {
        if (!driver.findElements(deleteCartButton).isEmpty()) {
            driver.findElement(deleteCartButton).click();
        }
    }

    @Override
    public HomePage continueShopping() {
        driver.findElement(continueShoppingButton).click();
        return new HomePageImpl(driver);
    }

    @Override
    public Page proceedToCheckout() {
        boolean isSignedIn = !driver.findElement(signInButton).getText().equals("Sign in");
        driver.findElement(proceedToCheckoutButton).click();

        if (isSignedIn) {
            return new AddressPageImpl(driver);
        } else {
            return new SignInPageImpl(driver);
        }
    }

    @Override
    public ItemPage goToItemPageViaImage() {
        driver.findElement(itemImage).click();
        return new ItemPageImpl(driver);
    }

    @Override
    public ItemPage goToItemPageViaTitle() {
        driver.findElement(itemTitle).click();
        return new ItemPageImpl(driver);
    }

    @Override
    public ItemPage goToItemPageViaDescription() {
        driver.findElement(itemDescription).click();
        return new ItemPageImpl(driver);
    }
}
