package com.automation.test.steps;

import com.automation.test.pages.*;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;

public class ReportSteps
{
    private MyDashboardPage myDashboardPage;
    private ReportMovePage reportMovePage;
    private DepartureDetailsPage departureDetailsPage;
    private DestinationDetailsPage destinationDetailsPage;
    private AnimalDetailsPage animalDetailsPage;
    private TransportDetailsPage transportDetailsPage;
    private ReportSummaryDetailsPage reportSummaryDetailsPage;
    private ReportConfirmationPage reportConfirmationPage;
    private ViewReportPDFPage viewReportPDFPage;
    private SelectSpeciesPage selectSpeciesPage;
    private ArrivalDetailsPage arrivalDetailsPage;

    @Step
    public void navigateToDashboard() {
        myDashboardPage.verifyTitle();
    }
    @Step
    public void clickReport() {
        reportMovePage.clickReport();
    }
    @Step
    public void clickContinue() {
        departureDetailsPage.clickContinue();
    }
    @Step
    public void clickSaveContinue() throws InterruptedException {
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
    public void clickOnReport() {
        reportSummaryDetailsPage.clickOnReport();

    }
    @Step
    public void verifyReportConfirmation() {
        reportConfirmationPage.verifyReportConfirmation();
    }
    @Step
    public void clickPrint() {
        reportConfirmationPage.clickPrint();
    }
    @Step
    public void verifyDetails() {
        viewReportPDFPage.verifyDetails();
    }
    @Step
    public void enterDestinationDetails(String cph, String yesOrNo) {
        destinationDetailsPage.enterCphAndSellOption(cph,yesOrNo);
    }
    @Step
    public void enterAnimalDetails(String flock, String id, String movementQty) {
        animalDetailsPage.enterDetails(flock,id, movementQty);
    }

    @Step
    public void reportAnimalLeaving() {
        selectSpeciesPage.clickAnimalLeaving();
    }

    @Step
    public void reportAnimalArriving() {
        selectSpeciesPage.clickAnimalArriving();
    }
    @Step
    public void enterAnimalArrivalDetails(String sellOption) {
        arrivalDetailsPage.selectAnimalBuyOption(sellOption);
        arrivalDetailsPage.selectArrivalDate();
    }

    @Step
    public void enterAnimalDepartureDetails(String cph) {
        departureDetailsPage.enterDepartureCph(cph);
        departureDetailsPage.selectDepartureDate();
    }

}

