package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SetupMovePage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Setup')]")
    private WebElementFacade setUp;
    public void clickSetup() {

        //setUp.click();
        evaluateJavascript("arguments[0].click();",setUp);
    }
}
