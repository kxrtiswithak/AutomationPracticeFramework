package com.sparta.room1.pom.pages.interfaces;

public interface ShoppingCartPage extends Page {

    boolean increaseQuantity();

    boolean reduceQuantity();

    boolean enterQuantityNumber();

    // reset cart to one item, deletes everything in cart then calls HomePage().setUp()
    boolean resetCart();

    boolean deleteItem();

    HomePage goBackToHomePage();

    // checks if signed in, return appropriate page
    Page proceedToCheckout();

    // differentiate between image and title (overloading, params)
    ItemPage goToItemPage();
}
