package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DepartureDetailsPage extends PageObject {

    @FindBy(id = "off")
    WebElementFacade continueBtn;
    public void clickContinue() {
        continueBtn.click();
    }
}
