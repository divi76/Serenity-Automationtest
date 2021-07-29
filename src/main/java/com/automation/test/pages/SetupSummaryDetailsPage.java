package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SetupSummaryDetailsPage extends PageObject {
    @FindBy(id = "submit")
    WebElementFacade saveContinue;
    public void clickOnSetup() {

        //saveContinue.click();
        evaluateJavascript("arguments[0].click();",saveContinue);
    }
}
