package com.automation.test.test;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@login"},
        plugin = {"pretty"},
        features = "classpath:features",
        glue = {"com.automation.test.stepdefinition"}
)
public class TestRunner {

}
