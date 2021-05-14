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
    private By continueShoppingButton = By.linkText("Continue shopping");
    private By termsOfServiceErrorBox = By.className("fancybox-error");
    private By termsOfService = By.className("fancybox-skin");
    private WebElement termsOfServiceCheckbox;

    public ShippingPageImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean doesTermsOfServiceShow() {
        driver.findElement(termsOfServiceLink).click();
        return driver.findElement(termsOfService).isDisplayed();
    }

    @Override
    public boolean doesNotProceedToCheckoutWhenTosUnticked() {
        String currentUrl = getUrl();
        termsOfServiceCheckbox = driver.findElement(termsOfServiceCheckboxId);
        if(termsOfServiceCheckbox.isSelected()) {
            termsOfServiceCheckbox.click();
        }
        driver.findElement(proceedToCheckoutButton).click();
        return getUrl().equals(currentUrl) && driver.findElement(termsOfServiceErrorBox).isDisplayed();
    }

    @Override
    public PaymentPage proceedToCheckout() {
        termsOfServiceCheckbox = driver.findElement(termsOfServiceCheckboxId);
        if(!termsOfServiceCheckbox.isSelected()) {
            termsOfServiceCheckbox.click();
        }
        driver.findElement(proceedToCheckoutButton).click();
        return new PaymentPageImpl(driver);
    }

    @Override
    public AddressPage continueShoppingButton() {
        driver.findElement(continueShoppingButton).click();
        return new AddressPageImpl(driver);
    }
}
