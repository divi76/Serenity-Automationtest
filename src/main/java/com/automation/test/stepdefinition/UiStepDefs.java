package com.automation.test.stepdefinition;

import com.automation.test.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UiStepDefs {
    @Steps
    private LoginSteps loginSteps;

    @Given("I am on the application")
    public void i_am_on_the_application() {
        loginSteps.verifyTitle();
    }

    @When("I navigate to Login Page and enter {string} {string}")
    public void iNavigateToLoginPageAndEnter(String user, String password) {
        loginSteps.login(user,password);
    }

    @When("login with invalid credentials {string} {string}")
    public void loginWithInvalidCredentials(String user, String password) {
        loginSteps.login(user,password);
    }

    @Then("I should get login error")
    public void iShouldGetLoginError() {
        loginSteps.verifyLoginError();
    }
}
