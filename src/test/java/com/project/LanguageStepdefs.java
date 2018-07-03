package com.project;

import com.project.helper.AllureListener;
import com.project.helper.TestConfig;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;
import com.project.pages.TestBase;
import com.project.webdriver.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import ru.yandex.qatools.allure.cucumberjvm.AllureReporter;

import java.net.MalformedURLException;

/**
 * Created by Pavel on 1/17/2018.
 */
public class LanguageStepdefs extends TestBase {

    @Before
    public void setUp() throws MalformedURLException {
        login = new LoginPage(Driver.getDriver());
        home = new HomePage(Driver.getDriver());
        config = new TestConfig();
        AllureReporter.applyFailureCallback(AllureListener.class);
    }

    @And("^User select \"([^\"]*)\" language$")
    public void userSelectLanguage(String language) {
        System.out.println("Assume method select language :)" + language);
    }

    @Then("^Language \"([^\"]*)\" is visible$")
    public void languageIsVisible(String arg0) {
        System.out.println("Assume method make assertion" + arg0);
    }

    @When("^Enters UserName as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void entersUserNameAsAndPasswordAs(String username, String password) throws Throwable {
        login.loginOnSite(username, password);
    }

    @Given("^User on Login page(\\d+)$")
    public void userOnLoginPage(int arg0) throws InterruptedException {
        login.openUrl("https://github.com/");
    }
}
