package com.automation.test.steps;

import com.automation.test.pages.*;
import net.thucydides.core.annotations.Step;

public class RegisterSteps {
    private RegisterPage registerPage;
    private CreateNewAccountPage newAccPage;
    private RegisterNewHoldingPage newHoldingPage;
    private YourDetailsPage yourDetailsPage;
    private FlockPage flockPage;
    private SummaryPage summaryPage;
    private AccountConfirmationPage accountConfirmationPage;

    @Step
    public void accessEnglish() {
        registerPage.accessEnglish();
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegister();
    }

    @Step
    public void enterAccountDetails(String user, String email, String pwd, String cpwd) {
        newAccPage.enterAccountDetails(user, email, pwd, cpwd);
    }

    @Step
    public void enterPrimaryHoldingDetails(String cph, String addr1, String addr2, String town,
                                           String county, String postCode) {
        newHoldingPage.enterPrimaryHoldingDetails(cph, addr1, addr2, town, county, postCode);
    }

    @Step
    public void enterYourDetails(String name, String crn, String landline, String mobile, String addr3, String addr4, String town1, String county1, String postCode1) {
        yourDetailsPage.enterYourDetails(name, crn, landline, mobile, addr3, addr4, town1, county1, postCode1);
    }

    @Step
    public void enterFlockDetails(String spices, String flock, String dairy) {
        flockPage.enterFlockDetails(spices, flock, dairy);
    }

    @Step
    public void clickOnSubmit() {
        summaryPage.clickOnSubmit();
    }

    @Step
    public void verifyAccountConfirmation() {
        accountConfirmationPage.verifyAccCreation();
    }
}


