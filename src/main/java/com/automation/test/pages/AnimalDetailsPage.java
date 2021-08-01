package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AnimalDetailsPage extends PageObject {
    @FindBy(xpath = "//*[contains(text(), 'Save and continue')]")
    WebElementFacade saveContinue;

    @FindBy(xpath = "//*[@id='panel-0']//*[contains(text(), 'Add tags') and @type='submit']")
    WebElementFacade addTags;

    @FindBy(id = "iflock_id")
    WebElementFacade flockId;

    @FindBy(id = "itag_id")
    WebElementFacade idTag;

    @FindBy(id = "movement_qty")
    WebElementFacade movement_qty;


    public void clickAddTags() {
    }

    public void enterDetails(String flock, String id, String movementQty) {
//        flockId.clear();
//        flockId.sendKeys(flock);
        idTag.clear();
        waitFor(20);
        idTag.sendKeys(id);
        addTags.click();


        movement_qty.clear();
        movement_qty.typeAndEnter(movementQty);

//        waitFor(20);
//        saveContinue.click();

//        evaluateJavascript("arguments[0].click();",saveContinue);
    }
}
