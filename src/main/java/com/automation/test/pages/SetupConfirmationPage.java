package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class SetupConfirmationPage extends PageObject {

   @FindBy(xpath = "//*[@id='content']//h3")
    WebElementFacade confirmation;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/button[1]")
    WebElementFacade viewPdf;

    public void verifySetupConfirmation() {
        waitForTextToAppear("recorded");
        assertThat( confirmation.getText(), containsString("has been recorded"));


    }

    public void clickPrint() {
        viewPdf.click();
//        evaluateJavascript("arguments[0].click();",viewPdf);


    }
}
