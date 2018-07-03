package com.project.webdriver;

import org.omg.CORBA.SystemException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setBrowserName("firefox");
            capabilities.setPlatform(Platform.LINUX);
            try {
                driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}