package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SelectSpeciesPage  extends PageObject {
    @FindBy(id = "off", timeoutInSeconds = "10")
    WebElementFacade reportAnimalLeaving;

    @FindBy(id = "on", timeoutInSeconds = "10")
    WebElementFacade reportAnimalArriving;

    public void clickAnimalLeaving() {
        reportAnimalLeaving.click();
    }
    public void clickAnimalArriving() {
        reportAnimalArriving.click();
    }
}
