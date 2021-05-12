package com.sparta.room1.pom.pages.interfaces;

public interface AddressPage extends Page {

    // Address addNewAddress();?

    // does delivery address change when selected
    boolean selectExistingDeliveryAddress();

    // copies delivery address when checkbox ticked, button appears when unticked
    boolean isBillingAddressDeliveryAddressWhenTicked();

    // should display address when 2 addresses are on account
    boolean selectExistingBillingAddress();

    // address_add_submit class
    NewAddressPage addNewAddressButton();

    // address_invoice_form class
    NewAddressPage addNewBillingAddressButton();

    // address_item_box class
    NewAddressPage updateDeliveryAddressButton();

    // address_alternate_item_box class
    NewAddressPage updateBillingAddressButton();

    // input text persists in checkout
    boolean textAreaWorks(String text);

    ShoppingCartPage continueShoppingButton();

    ShippingPage proceedToCheckout();
}
