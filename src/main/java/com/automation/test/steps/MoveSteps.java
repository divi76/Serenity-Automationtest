package com.automation.test.steps;

import com.automation.test.pages.*;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MoveSteps
{
    private MyDashboardPage myDashboardPage;
    private SetupMovePage setupMovePage;
    private DepartureDetailsPage departureDetailsPage;
    private DestinationDetailsPage destinationDetailsPage;
    private AnimalDetailsPage animalDetailsPage;
    private TransportDetailsPage transportDetailsPage;
    private SetupSuummaryDetailsPage setupSuummaryDetailsPage;
    private SetupConfrimationPage setupConfrimationPage;
    private ViewSetupPDFPage viewSetupPDFPage;

    @Step
    public void navigateToDashboard() {
        myDashboardPage.verifyTitle();
    }
    @Step
    public void clickSetup() {
        setupMovePage.clickSetup();
    }
    @Step
    public void clickContinue() {
        departureDetailsPage.clickContinue();
    }
    @Step
    public void clickSaveContinue() {
        destinationDetailsPage.clickSaveContinue();
    }
    @Step
    public void clickContinueOnTransportPage() {
        transportDetailsPage.clickSaveContinue();
    }

    @Step
    public void clickAddTags() {
        animalDetailsPage.clickAddTags();
    }
    @Step
    public void clickOnSetup() {
        setupSuummaryDetailsPage.clickOnSetup();

    }
    @Step
    public void verifySetupConfirmation() {
        setupConfrimationPage.verifySetupConfirmation();
    }
    @Step
    public void clickPrint() {
        setupConfrimationPage.clickPrint();
    }
    @Step
    public void verifyDetails() {
        viewSetupPDFPage.verifyDetails();
    }

    public void enterDestinationDetails(String cph, String yesOrNo) {
        destinationDetailsPage.enterCphAndSellOption(cph,yesOrNo);
    }

    public void enterAnimalDetails(String flock, String id, String movementQty) {
        animalDetailsPage.enterDetails(flock,id, movementQty);
    }
}
