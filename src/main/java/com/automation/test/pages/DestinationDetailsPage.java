package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DestinationDetailsPage extends PageObject {
    @FindBy(id = "submit")
    WebElementFacade saveAndContinue;

    @FindBy(id = "has_keeper_changed_yes")
    WebElementFacade sellOption;

    @FindBy(id = "destination_cph")
    WebElementFacade cph;

    public void clickSaveContinue() {
        saveAndContinue.click();
    }

    public void enterCphAndSellOption(String cphNumber, String sellOptionValue) {
        cph.clear();
        cph.sendKeys(cphNumber);
        if("YES".equalsIgnoreCase(sellOptionValue)) {
            sellOption.click();
        }
    }
}
