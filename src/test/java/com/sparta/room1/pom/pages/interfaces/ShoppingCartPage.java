package com.sparta.room1.pom.pages.interfaces;

import com.sparta.room1.pom.pages.Page;

public interface ShoppingCartPage{

    void increaseQuantity();

    void reduceQuantity();

    void enterQuantityNumber(String quantityNumber);

    // reset cart to one item, deletes everything in cart then calls HomePage().setUp()
    void resetCart();

    void deleteItem();

    HomePage continueShopping();

    // checks if signed in, return appropriate page
    Page proceedToCheckout();

    ItemPage goToItemPageViaImage();

    ItemPage goToItemPageViaTitle();

    ItemPage goToItemPageViaDescription();
}
