package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;

public class FlockPage extends PageObject {

    @FindBy(id = "species_etid")
    WebElementFacade species;

    @FindBy(id = "primary_flock")
    WebElementFacade primaryFlock;

    @FindBy(id = "dairy")
    WebElementFacade dairyOrMeat;

    @FindBy(id = "submit")
    private WebElementFacade submit;

    public void enterFlockDetails(String speciey, String flock, String dairy) {

        Select select = new Select(find("//select[@id='species_etid']"));
        select.selectByIndex(2);

        primaryFlock.clear();
        primaryFlock.type(flock);

        find("//span[@class='eid-radio__indicator']").click();

        submit.click();
    }


}
