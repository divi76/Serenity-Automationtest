package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SetupConfrimationPage extends PageObject {

    @FindBy(className = "eid-button eid-button--lg")
    WebElementFacade saveContinue;

    public void verifySetupConfirmation() {

    }

    public void clickPrint() {
    }
}
