package com.project.pages;

import com.project.webdriver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

/**
 * Created by paveldovgan on 8/20/17.
 */
public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) throws MalformedURLException {
        this.driver= driver;
        wait=new WebDriverWait(driver,10);
    }

public void clickOnElement(By element){
    find(element).click();
}


public void setElementText(By element,String text){
  find(element).sendKeys(text);
}

public String getElementText(By element){
   return find(element).getText();
}

public WebElement find(By locator){
    WebDriverWait wait =new WebDriverWait(driver,15);
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    return driver.findElement(locator);
}

public void openUrl(String url){
    driver.get(url);
}


}
