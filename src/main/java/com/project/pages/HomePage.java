package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * Created by ASUS on 03.05.2017.
 */
public class HomePage extends BasePage {

    private By userName = By.xpath("//a[@title='Profile']/span");

    public HomePage(WebDriver driver) throws MalformedURLException {
        super(driver);
    }

   public HomePage getUserName(){
        getElementText(userName);
        return this;
   }
}
