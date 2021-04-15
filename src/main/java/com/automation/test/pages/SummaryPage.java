package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SummaryPage extends PageObject {
    @FindBy(id = "submit")
    private WebElementFacade submit;

    public void clickOnSubmit() {
        submit.click();
    }
}
