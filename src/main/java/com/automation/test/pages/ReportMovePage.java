package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ReportMovePage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Report')]", timeoutInSeconds = "10")
    private WebElementFacade report;
    public void clickReport() {

        //setUp.click();
        evaluateJavascript("arguments[0].click();",report);
    }
}
