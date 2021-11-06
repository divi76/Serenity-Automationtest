package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.time.temporal.ChronoUnit.SECONDS;

public class DepartureDetailsPage extends PageObject {

    @FindBy(id = "off", timeoutInSeconds = "10")
    WebElementFacade continueBtn;

    @FindBy(id = "departure_cph", timeoutInSeconds = "10")
    WebElementFacade departureCph;


    @FindBy(id = "departure_date_day",  timeoutInSeconds="10")
    WebElementFacade departureDay;
    @FindBy(id = "departure_date_month",  timeoutInSeconds="10")
    WebElementFacade departureMonth;
    @FindBy(id = "departure_date_year",  timeoutInSeconds="10")
    WebElementFacade departureYear;
    public void clickContinue() {
        //continueBtn.click();
        evaluateJavascript("arguments[0].click();",continueBtn);

    }
    public void enterDepartureCph(String cph) {
        departureCph.clear();
        departureCph.sendKeys(cph);
    }
    public void selectDepartureDate() {
        String dateString =new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        departureDay.withTimeoutOf(10, SECONDS).waitUntilClickable();
        String[] dateArr = dateString.split("-");
        departureDay.selectByValue(dateArr[0]);
        departureMonth.selectByValue(dateArr[1]);
        departureYear.selectByValue(dateArr[2]);
    }
}
