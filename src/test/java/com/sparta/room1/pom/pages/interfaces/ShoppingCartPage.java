package com.sparta.room1.pom.pages.interfaces;

import com.sparta.room1.pom.pages.Page;

public interface ShoppingCartPage{

    void increaseQuantity();

    void reduceQuantity();

    void enterQuantityNumber();

    // reset cart to one item, deletes everything in cart then calls HomePage().setUp()
    void resetCart();

    void deleteItem();

    HomePage goBackToHomePage();

    // checks if signed in, return appropriate page
    Page proceedToCheckout();

    // differentiate between image and title (overloading, params)
    ItemPage goToItemPage();
}
