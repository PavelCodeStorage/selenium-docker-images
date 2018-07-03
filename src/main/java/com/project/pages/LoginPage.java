package com.project.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;


public class LoginPage extends BasePage {

    private By loginField = By.xpath("//input[@id='email']");
    private By passwordField = By.xpath("//input[@id='pass']");
    private By signInButton = By.xpath("//input[@type='submit']");

    public LoginPage(WebDriver driver) throws MalformedURLException {
        super(driver);
    }

    public LoginPage loginOnSite(String login, String password) {
        setElementText(loginField,login);
        setElementText(passwordField,password);
        clickOnElement(signInButton);
        return this;
    }
}
