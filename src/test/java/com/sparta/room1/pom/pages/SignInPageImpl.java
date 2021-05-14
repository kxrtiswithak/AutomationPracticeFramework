package com.sparta.room1.pom.pages;

import com.sparta.room1.pom.pages.interfaces.CreateAccountPage;
import com.sparta.room1.pom.pages.interfaces.AddressPage;
import com.sparta.room1.pom.pages.interfaces.ForgotPasswordPage;
import com.sparta.room1.pom.pages.interfaces.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.Properties;

public class SignInPageImpl extends Page implements SignInPage {

    private WebDriver driver;
    private By createAccountTextBox = By.id("email_create");
    private By createAnAccountButton = By.id("SubmitCreate");
    private By alreadyRegisteredEmailTextBox = By.id("email");
    private By alreadyRegisteredPasswordTextBox = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By forgottenPasswordButton = By.linkText("Forgot your password?");

    public SignInPageImpl(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public CreateAccountPage createAccount(String email) {
        driver.findElement(createAccountTextBox).sendKeys(email);
        driver.findElement(createAnAccountButton).click();
        return new CreateAccountPageImpl(driver);
    }

    @Override
    public AddressPage signIn(String email, String password) {
        String usernamesPasswordFileLocation = "src/test/resources/login.properties";
        Properties properties = new Properties();
        try {
            properties.load(new java.io.FileReader(usernamesPasswordFileLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(alreadyRegisteredEmailTextBox).sendKeys(properties.getProperty(email));
        driver.findElement(alreadyRegisteredPasswordTextBox).sendKeys(properties.getProperty(password));
        driver.findElement(signInButton).click();
        return new AddressPageImpl(driver);
    }

    @Override
    public ForgotPasswordPage goToForgetPassword() {
        driver.findElement(forgottenPasswordButton).click();
        return new ForgotPasswordPageImpl(driver);
    }
}
