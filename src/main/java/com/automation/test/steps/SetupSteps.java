package com.automation.test.steps;

import com.automation.test.pages.*;
import net.thucydides.core.annotations.Step;

import java.awt.*;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class SetupSteps
{
    private MyDashboardPage myDashboardPage;
    private SetupMovePage setupMovePage;
    private DepartureDetailsPage departureDetailsPage;
    private DestinationDetailsPage destinationDetailsPage;
    private AnimalDetailsPage animalDetailsPage;
    private TransportDetailsPage transportDetailsPage;
    private SetupSummaryDetailsPage setupSummaryDetailsPage;
    private SetupConfirmationPage setupConfirmationPage;
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
    public void selectTomorrowDate() {
        departureDetailsPage.selectTomorrowDate();
    }
    @Step
    public void clickSaveContinue()
    {
        destinationDetailsPage.clickSaveContinue();
    }
    @Step
    public void UploadViaFile() throws AWTException, InterruptedException, IOException {
        animalDetailsPage.uploadAFile();
    }
    @Step
    public void clickSaveContinueTransportdetailPage()
    {
        transportDetailsPage.clickSaveContinue();
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
        setupSummaryDetailsPage.clickOnSetup();

    }
    @Step
    public void verifySetupConfirmation() {
        setupConfirmationPage.verifySetupConfirmation();
    }
    @Step
    public void clickPrint() {
        setupConfirmationPage.clickPrint();
    }
    @Step
    public void verifyDetails() {
        viewSetupPDFPage.verifyDetails();
    }

    public void enterDestinationDetails(String cph, String yesOrNo) throws InterruptedException {
        destinationDetailsPage.enterCphAndSellOption(cph,yesOrNo);
    }

    public void enterAnimalDetails(String flock, String id, String movementQty) {
        animalDetailsPage.enterDetails(flock,id, movementQty);
    }
}
