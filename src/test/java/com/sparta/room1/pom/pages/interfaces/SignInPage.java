package com.sparta.room1.pom.pages.interfaces;

public interface SignInPage {

    // check email is valid
    CreateAccountPage createAccount(String email);

    AddressPage signIn(String email, String password);

    ForgotPasswordPage goToForgetPassword();
}
