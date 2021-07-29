package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AnimalDetailsPage extends PageObject {
    @FindBy(id = "submit")
    WebElementFacade saveContinue;

    @FindBy(className = "eid-button eid-button--sm")
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
        flockId.clear();
        flockId.sendKeys(flock);
        idTag.clear();
        idTag.sendKeys(id);
        //addTags.click();
        evaluateJavascript("arguments[0].click();",addTags);

        movement_qty.clear();
        movement_qty.sendKeys(movementQty);

        //saveContinue.click();
        evaluateJavascript("arguments[0].click();",saveContinue);
    }
}
