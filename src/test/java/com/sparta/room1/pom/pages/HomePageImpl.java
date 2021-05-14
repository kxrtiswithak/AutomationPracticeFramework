package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.HomePage;
import com.sparta.room1.pom.pages.interfaces.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePageImpl extends Page implements HomePage {

    private WebDriver driver;

    private By blouse = new By.ByLinkText("Blouse");
    private By purchaseItemLink = new By.ByLinkText("Add to cart");
    //private By shoppingCart = new By.ByLinkText("Cart");
    private By shoppingCart = new By.ByCssSelector(".shopping_cart > a");
    private By continueShopping = new By.ByCssSelector(".continue > span");

    public HomePageImpl(WebDriver driver) {
        this.driver = driver;
        driver.get("http://automationpractice.com");
    }

    @Override
    public ShoppingCartPage goToShoppingCartPage() {
        driver.findElement(shoppingCart).click();
        return new ShoppingCartPageImpl(driver);
    }

    @Override
    public void addToCart() {
        WebElement blouseImg = driver.findElement(blouse);
        Actions action = new Actions(driver);
        action.moveToElement(blouseImg).perform();
        driver.findElement(purchaseItemLink).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(continueShopping).click();
    }

}
