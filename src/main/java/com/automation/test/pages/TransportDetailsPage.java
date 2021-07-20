package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransportDetailsPage extends PageObject {
    @FindBy(id = "submit")
    WebElementFacade saveContinue;

    public void clickSaveContinue() {
        saveContinue.click();
    }
}
