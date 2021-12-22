package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class ViewSetupPDFPage extends  PageObject {
    @FindBy(xpath = "//*[@id=\"content\"]//h1")
    WebElementFacade confirmation;

    public void verifyDetails() {
        waitForTextToAppear("Movement details Departing");
        assertThat( confirmation.getText(), containsString("Movement details Departing"));
    }

    public void verifyArrivingDetails() {
        waitForTextToAppear("Movement details Arriving");
        assertThat( confirmation.getText(), containsString("Movement details Arriving"));
    }
}
