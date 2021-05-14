package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.NewAddressPage;
import com.sparta.room1.pom.pages.interfaces.ShippingPage;
import com.sparta.room1.pom.pages.interfaces.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressPageImpl extends Page implements AddressPage {

    private WebDriver driver;

    private WebElement deliveryAddress;
    private WebElement billingAddress;

    private By useBillingAsDelivery = By.id("addressesAreEquals");
    private By addressLine1 = By.className("address_address1 address_address2");
    private By addressLine2 = By.className("address_city address_state_name address_postcode");
    private By addressUpdate = By.className("address_update");
    private By selectedDeliveryAddress = By.id("id_address_delivery");
    private By selectedBillingAddress = By.id("id_address_invoice");
    private By addNewDeliveryAddress = By.className("address_add submit");
    private By addNewBillingAddress = By.className("address_invoice_form");
    private By messageBox = By.name("message");
    private By proceedToCheckout = By.linkText("Proceed to checkout");
    private By continueShopping = By.linkText("Continue Shopping");

    public AddressPageImpl(WebDriver driver) {
        this.driver = driver;
        deliveryAddress = driver.findElement(By.id("address_delivery"));
        billingAddress = driver.findElement(By.id("address_invoice"));
    }

    @Override
    public void selectExistingDeliveryAddress(String addressName) {
        WebElement addressDropdown = driver.findElement(selectedDeliveryAddress);
        Select dropdown = new Select(addressDropdown);
        dropdown.selectByValue(addressName);
    }

    @Override
    public boolean isBillingAddressDeliveryAddressWhenTicked() {
        return (deliveryAddress.findElement(addressLine1) == billingAddress.findElement(addressLine1)) &&
                (deliveryAddress.findElement(addressLine2) == billingAddress.findElement(addressLine2)) &&
                (driver.findElement(useBillingAsDelivery).isSelected());
    }

    @Override
    public void selectExistingBillingAddress(String addressName) {
        if(!driver.findElement(useBillingAsDelivery).isSelected()){
            WebElement addressDropdown = driver.findElement(selectedBillingAddress);
            Select dropdown = new Select(addressDropdown);
            dropdown.selectByValue(addressName);
        }
    }

    @Override
    public NewAddressPage addNewAddressButton() {
        billingAddress.findElement(addNewDeliveryAddress).click();
        return new NewAddressPageImpl(driver);
    }

    @Override
    public NewAddressPage addNewBillingAddressButton() {
        deliveryAddress.findElement(addNewBillingAddress).click();
        return new NewAddressPageImpl(driver);
    }

    @Override
    public NewAddressPage updateDeliveryAddressButton() {
        deliveryAddress.findElement(addressUpdate).click();
        return new NewAddressPageImpl(driver);
    }

    @Override
    public NewAddressPage updateBillingAddressButton() {
        billingAddress.findElement(addressUpdate).click();
        return new NewAddressPageImpl(driver);
    }

    @Override
    public boolean textAreaWorks(String text) {
        WebElement textarea = driver.findElement(messageBox);
        textarea.sendKeys("Test");
        return textarea.getText().equals("Test");
    }

    @Override
    public ShoppingCartPage continueShoppingButton() {
        driver.findElement(continueShopping);
        return new ShoppingCartPageImpl(driver);
    }

    @Override
    public ShippingPage proceedToCheckout() {
        driver.findElement(proceedToCheckout);
        return new ShippingPageImpl(driver);
    }
}
