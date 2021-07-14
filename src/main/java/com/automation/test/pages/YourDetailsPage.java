package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;


public class YourDetailsPage extends PageObject {

    @FindBy(id = "keeper_name")
    WebElementFacade keeperName;

    @FindBy(id = "crn")
    WebElementFacade crn;

    @FindBy(id = "keeper_phone")
    WebElementFacade keeperPhone;

    @FindBy(id = "keeper_mobile")
    WebElementFacade keeperMobile;

    @FindBy(id = "keeper_street")
    WebElementFacade keeperStreet;

    @FindBy(id = "keeper_locality")
    WebElementFacade keeperLocality;

    @FindBy(id = "keeper_town")
    WebElementFacade keeperTown;

    @FindBy(id = "keeper_county")
    WebElementFacade keeperCounty;

    @FindBy(id = "keeper_postcode")
    WebElementFacade keeperPostcode;

    @FindBy(id = "submit")
    private WebElementFacade submit;

    public void enterYourDetails(String name, String keeperCrn, String landline, String mobile, String street, String locality, String town, String county, String postCode) {
        getDriver().manage().window().fullscreen();
        keeperName.clear();
        keeperName.type(name);
        crn.clear();
        crn.type(keeperCrn);
        keeperPhone.clear();
        keeperPhone.type(landline);
        keeperMobile.clear();
        keeperMobile.type(mobile);
        keeperStreet.clear();
        keeperStreet.type(street);
        keeperLocality.clear();
        keeperLocality.type(locality);
        keeperTown.clear();
        keeperTown.type(town);
        keeperCounty.clear();
        keeperCounty.type(county);
        keeperPostcode.clear();
        keeperPostcode.type(postCode);

        submit.click();

    }

}
