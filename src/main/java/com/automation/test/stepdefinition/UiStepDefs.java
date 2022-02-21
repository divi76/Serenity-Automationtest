package com.automation.test.stepdefinition;

import com.automation.test.steps.LoginSteps;
import com.automation.test.steps.SetupSteps;
import com.automation.test.steps.RegisterSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;
import java.io.IOException;

public class UiStepDefs {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private RegisterSteps registerSteps;
    @Steps
    private SetupSteps setupSteps;

    @Given("I am on the application")
    public void i_am_on_the_application() throws InterruptedException {
        loginSteps.verifyTitle();
        }

    @When("I navigate to Login Page and enter {string} {string}")
    public void iNavigateToLoginPageAndEnter(String user, String password) {
        loginSteps.login(user, password);
    }

    @When("login with invalid credentials {string} {string}")
    public void loginWithInvalidCredentials(String user, String password) {
        loginSteps.login(user, password);
    }

    @Then("I should get login error")
    public void iShouldGetLoginError() {
        loginSteps.verifyLoginError();
    }


    @When("I click on access english")
    public void iClickOnAccessEnglish() {
        registerSteps.accessEnglish();
    }

    @When("I click on register")
    public void iClickOnRegister() {
        registerSteps.clickRegister();
    }

    @And("I enter the new account details using {string},{string},{string},{string}")
    public void iEnterTheNewAccountDetailsUsing(String user, String email, String pwd, String cpwd) {
        registerSteps.enterAccountDetails(user, email, pwd, cpwd);
    }

    @And("I enter the holding page details using {string},{string},{string},{string},{string},{string}")
    public void iEnterTheHoldingPageDetailsUsing(String cph, String addr1, String addr2, String town, String county, String postCode) {
        registerSteps.enterPrimaryHoldingDetails(cph, addr1, addr2, town, county, postCode);
    }

    @And("I enter the your details using {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void iEnterTheYourDetailsUsing(String name, String crn, String landline, String mobile, String addr3, String addr4, String town1, String county1, String postCode1) {
        registerSteps.enterYourDetails(name, crn, landline, mobile, addr3, addr4, town1, county1, postCode1);
    }

    @And("I enter the flock details using {string},{string},{string}")
    public void iEnterTheFlockDetailsUsing(String spices, String flock, String dairy) {
        registerSteps.enterFlockDetails(spices, flock, dairy);
    }

    @Then("I can see the summary page and click on submit button")
    public void iCanSeeTheSummaryPageAndClickOnSubmitButton() {
        registerSteps.clickOnSubmit();
    }

    @And("I can see the confirmation page for account creation")
    public void iCanSeeTheConfirmationPageForAccountCreation() {
        registerSteps.verifyAccountConfirmation();
    }

    @Given("I access the eidcymru landing page")
    public void iAccessTheEidcymruLandingPage() {
        loginSteps.accessLandingPage();
    }


    @Then("I should get My Dashboard page")
    public void iShouldGetMyDashboardPage() {
        setupSteps.navigateToDashboard();
    }

    @And("Click on setup")
    public void clickOnSetup() {
        setupSteps.clickSetup();
    }

    @And("I click on continue")
    public void iClickOnContinue() {
        setupSteps.clickContinue();
    }

    @And("I select tomorrow's date")
    public void iselectTomorrowDate() {
        setupSteps.selectTomorrowDate();
    }


    @And("I click on save and continue")
    public void iClickOnSaveAndContinue(){
        setupSteps.clickSaveContinue();
    }

    @And("I click and upload file")
    public void iClickAndUploadViaFile() throws AWTException, InterruptedException, IOException {
        setupSteps.UploadViaFile();
    }


    @And("I click on save and continue in transport details page")
    public void ClickOnSaveAndContinueTransportDetailsPage(){
        setupSteps.clickSaveContinueTransportdetailPage();
    }

    @And("I enter the destination details using {string} {string} and click continue")
    public void iEnterTheDestinationDetailsUsingClickContinue(String cph, String YES) throws InterruptedException {
        setupSteps.enterDestinationDetails(cph,YES);
    }

    @And("I enter the animal details using {string} {string} {string}")
    public void iEnterTheAnimalDetailsUsing(String flock, String id, String movementQty) {
        setupSteps.enterAnimalDetails(flock,id,movementQty);
    }

    @And("I click on add tags and enter <animals moving>")
    public void iClickOnAddTagsAndEnterAnimalsMoving() {
        setupSteps.clickAddTags();
    }

    @Then("I can see the summary page and click on setup button")
    public void iCanSeeTheSummaryPageAndClickOnSetupButton() {
        setupSteps.clickOnSetup();
    }

    @And("I can see the confirmation page for setup a movement")
    public void iCanSeeTheConfirmationPageForSetupAMovement() {
        setupSteps.verifySetupConfirmation();
    }

    @Then("I click on view or print this move button")
    public void iClickOnViewOrPrintThisMoveButton() {
        setupSteps.clickPrint();
    }

    @And("I can see the movement details departing page")
    public void iCanSeeTheMovementDetailsDepartingPage() {
        setupSteps.verifyDetails();
    }
}

