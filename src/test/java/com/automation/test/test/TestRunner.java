package com.automation.test.test;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@setup_movement_upload"},
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"com.automation.test.stepdefinition"}
)
public class TestRunner {

}
