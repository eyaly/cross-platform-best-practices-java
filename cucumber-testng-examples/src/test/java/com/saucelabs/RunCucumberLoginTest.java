package com.saucelabs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/DemoLoginTest.feature",
        glue = "com/saucelabs/stepdefinitions"
        )
public class RunCucumberLoginTest extends AbstractTestNGCucumberTests {
}


