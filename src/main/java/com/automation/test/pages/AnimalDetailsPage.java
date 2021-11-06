package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AnimalDetailsPage extends PageObject {
    @FindBy(xpath = "//*[contains(text(), 'Save and continue')]", timeoutInSeconds = "10")
    WebElementFacade saveContinue;

    @FindBy(xpath = "//*[@id='panel-0']//*[contains(text(), 'Add tags') and @type='submit']", timeoutInSeconds = "10")
    WebElementFacade addTags;

    @FindBy(id = "iflock_id", timeoutInSeconds = "10")
    WebElementFacade flockId;

    @FindBy(id = "itag_id", timeoutInSeconds = "10")
    WebElementFacade idTag;

    @FindBy(id = "movement_qty", timeoutInSeconds = "10")
    WebElementFacade movement_qty;


    public void clickAddTags() {
    }

    public void enterDetails(String flock, String id, String movementQty) {
        flockId.clear();
        flockId.sendKeys(flock);
        idTag.clear();
        idTag.sendKeys(id);
        addTags.click();


        movement_qty.clear();
        movement_qty.typeAndEnter(movementQty);

//        waitFor(20);
//        saveContinue.click();

//        evaluateJavascript("arguments[0].click();",saveContinue);
    }
}
