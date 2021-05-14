package com.sparta.room1.pom.pages;

import org.openqa.selenium.WebDriver;

public abstract class Page {

    WebDriver driver;

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}