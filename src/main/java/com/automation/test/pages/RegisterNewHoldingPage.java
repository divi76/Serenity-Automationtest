package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;


public class RegisterNewHoldingPage extends PageObject {
    @FindBy(id = "cph")
    WebElementFacade holdingCph;

    @FindBy(id = "holding_street")
    WebElementFacade holdingStreet;

    @FindBy(id = "holding_locality")
    WebElementFacade holdingLocality;

    @FindBy(id = "holding_town")
    WebElementFacade holdingTown;

    @FindBy(id = "holding_county")
    WebElementFacade holdingCounty;

    @FindBy(id = "holding_postcode")
    WebElementFacade holdingPostcode;

    @FindBy(id = "contact_address")
    WebElementFacade contactAddress;

    @FindBy(id = "submit")
    private WebElementFacade submit;

    public void enterPrimaryHoldingDetails( String cph, String addr1, String addr2, String town, String county, String postCode) {
        getDriver().manage().window().maximize();
        holdingCph.clear();
        holdingCph.type(cph);
        holdingStreet.clear();
        holdingStreet.type(addr1);
        holdingLocality.clear();
        holdingLocality.type(addr2);
        holdingTown.clear();
        holdingTown.type(town);
        holdingCounty.clear();
        holdingCounty.type(county);
        holdingPostcode.clear();
        holdingPostcode.type(postCode);

        submit.click();
    }
}
