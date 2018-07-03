package com.project;


import com.project.helper.TestConfig;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;
import com.project.pages.TestBase;
import com.project.webdriver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.project.helper.AllureListener;
import ru.yandex.qatools.allure.cucumberjvm.AllureReporter;

import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;

/**
 * Created by ASUS on 29.08.2017.
 */

public class LoginStepdefs extends TestBase {

    private static final Logger log = Logger.getLogger(LoginStepdefs.class);

    @Before
    public void setUp() throws MalformedURLException {
        login = new LoginPage(Driver.getDriver());
        home = new HomePage(Driver.getDriver());
        config = new TestConfig();
        AllureReporter.applyFailureCallback(AllureListener.class);
    }

    @Given("^User on Login page$")
    public void userOnLoginPage() throws Throwable {
        login.openUrl(config.getUrl());
    }

    @When("^Enters UserName as ([^\"]*) and Password as ([^\"]*)$")
    public void entersUserNameAsLoginAndPasswordAsPassword(String username, String password) throws Throwable {
        login.loginOnSite(username, password);
        log.info("User logged in");
    }

    @Then("^Message displayed Login Successfully$")
    public void messageDisplayedLoginSuccessfully() throws Throwable {
        Assert.assertEquals(home.getUserName(), "Pavel");
    }


}
