package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import static java.lang.Thread.sleep;


public class SummaryPage extends PageObject {
    @FindBy(id = "submit", timeoutInSeconds = "10")
    private WebElementFacade submit;

    public void clickOnSubmit() throws InterruptedException {
        getDriver().manage().window().maximize();
        //submit.click();
        sleep(2000);
        evaluateJavascript("arguments[0].click();",submit);
    }
}
