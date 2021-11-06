package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static java.time.temporal.ChronoUnit.SECONDS;


public class DestinationDetailsPage extends PageObject {
    @FindBy(id = "submit", timeoutInSeconds="10")
    WebElementFacade saveAndContinue;

    @FindBy(xpath = "//*[@id='has_keeper_changed']/div/label[1]/span[2]",  timeoutInSeconds="10")
    WebElementFacade sellOption;

    @FindBy(xpath = "//*[@id='destination_address']", timeoutInSeconds="10")
    WebElementFacade address;

    @FindBy(id = "destination_cph", timeoutInSeconds="10")
    WebElementFacade cph;

    @FindBy(id = "iflock_id", timeoutInSeconds="10")
    WebElementFacade flockId;

    public void clickSaveContinue() throws InterruptedException {

// waitFor(30);
// saveAndContinue.click();
//        waitForAngularRequestsToFinish();
        sleep(2000);
     evaluateJavascript("arguments[0].click();",saveAndContinue);
//        waitFor(flockId);
    }

    public void enterCphAndSellOption(String cphNumber, String sellOptionValue) {
        cph.clear();
        cph.sendKeys(cphNumber);
        //waitForTextToDisappear("Address not shown for this movement");
        if("YES".equalsIgnoreCase(sellOptionValue)) {
            sellOption.withTimeoutOf(10, SECONDS).waitUntilClickable().click();
            //sellOption.click();

//            evaluateJavascript("arguments[0].click();",sellOption);

        }
    }
}
