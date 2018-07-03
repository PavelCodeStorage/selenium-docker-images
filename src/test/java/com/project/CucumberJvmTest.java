package com.project;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@CucumberOptions(features = {"src/test/resources/features"})
public class CucumberJvmTest extends AbstractTestNGCucumberTests {
}