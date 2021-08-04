package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class DestinationDetailsPage extends PageObject {
    @FindBy(id = "submit")
    WebElementFacade saveAndContinue;

    @FindBy(xpath = "//*[@id='has_keeper_changed']/div/label[1]/span[2]")
    WebElementFacade sellOption;

    @FindBy(xpath = "//*[@id='destination_address']")
    WebElementFacade address;

    @FindBy(id = "destination_cph")
    WebElementFacade cph;

    @FindBy(id = "iflock_id")
    WebElementFacade flockId;

    public void clickSaveContinue() {

        waitFor(30);
        saveAndContinue.click();
//        waitForAngularRequestsToFinish();

//        evaluateJavascript("arguments[0].click();",saveAndContinue);
//        waitFor(flockId);
    }

    public void enterCphAndSellOption(String cphNumber, String sellOptionValue) {
        WebDriver myDriver = getDriver();
        myDriver.manage().deleteAllCookies();
        cph.clear();
        cph.type(cphNumber);
//        cph.sendKeys(cphNumber);
        waitForTextToDisappear("Address not shown for this movement");
//        waitFor(20);
        if("YES".equalsIgnoreCase(sellOptionValue)) {
            sellOption.click();

//            evaluateJavascript("arguments[0].click();",sellOption);

        }
    }
}
