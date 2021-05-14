package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.PaymentPage;
import com.sparta.room1.pom.pages.interfaces.ShippingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPageImpl extends Page implements ShippingPage {

    private WebDriver driver;
    private By termsOfServiceCheckboxId = By.id("cgv");
    private By termsOfServiceLink = By.linkText("(Read the Terms of Service)");
    private By proceedToCheckoutButton = By.linkText("Proceed to checkout");

    public ShippingPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doesTermsOfServiceShow() {
        String termsOfServiceText = driver.findElement(termsOfServiceLink).getText();
        return termsOfServiceText.contains("http://automationpractice.com/index.php?id_cms=3&controller=cms&content_only=1");
    }

    @Override
    public boolean doesNotProceedToCheckoutWhenTosUnticked() {
        return false;
    }

    @Override
    public PaymentPage proceedToCheckout() {
        WebElement termsOfServiceCheckbox = driver.findElement(termsOfServiceCheckboxId);
        if(!termsOfServiceCheckbox.isSelected()) {
            termsOfServiceCheckbox.click();
        }
        driver.findElement(proceedToCheckoutButton).click();
        return new PaymentPageImpl(driver);
    }

    @Override
    public AddressPage continueShoppingButton() {
        return null;
    }
}
