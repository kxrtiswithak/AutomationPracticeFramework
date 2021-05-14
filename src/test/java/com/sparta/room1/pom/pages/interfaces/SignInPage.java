package com.sparta.room1.pom.pages.interfaces;

import com.sparta.room1.pom.pages.Page;

public interface SignInPage {

    // check email is valid
    AccountPage createAccount(String email);

    AddressPage signIn(String email, String password);

    ForgotPasswordPage goToForgetPassword();
}
