package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReportConfirmationPage extends PageObject {

    @FindBy(className = "eid-button eid-button--lg")
    WebElementFacade viewPdf;

    public void verifyReportConfirmation() {
        assertThat( find("//h3[@class='eid-panel---success eid-panel---success']").getText(), containsString("Movement created"));

    }

    public void clickPrint() {
        // viewPdf.click();
        evaluateJavascript("arguments[0].click();",viewPdf);


    }
}