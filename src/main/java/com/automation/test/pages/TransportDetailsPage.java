package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransportDetailsPage extends PageObject {
    @FindBy(xpath = "//*[@id='transport_auth_number']")
    WebElementFacade transportAuthorisationNumber;

    public void clickSaveContinue() {

        transportAuthorisationNumber.typeAndEnter("");
//        evaluateJavascript("arguments[0].click();",saveContinue);
    }
}
