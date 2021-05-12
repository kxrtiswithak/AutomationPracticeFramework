package com.sparta.room1.pom.pages.interfaces;

public interface SignInPage extends Page {

    // check email is valid
    AccountPage createAccount(String email);

    AddressPage signIn(String email, String password);

    ForgotPasswordPage goToForgetPassword();
}
