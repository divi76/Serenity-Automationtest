package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.time.temporal.ChronoUnit.SECONDS;

public class ArrivalDetailsPage extends PageObject {
    @FindBy(xpath = "//*[@id='has_keeper_changed']/div/label[1]/span[2]",  timeoutInSeconds="10")
    WebElementFacade sellOption;

    @FindBy(id = "arrival_date_day",  timeoutInSeconds="10")
    WebElementFacade arrivalDay;
    @FindBy(id = "arrival_date_month",  timeoutInSeconds="10")
    WebElementFacade arrivalMonth;
    @FindBy(id = "arrival_date_year",  timeoutInSeconds="10")
    WebElementFacade arrivalYear;

    public void selectAnimalBuyOption(String sellOptionValue) {
        if("YES".equalsIgnoreCase(sellOptionValue)) {
            sellOption.withTimeoutOf(10, SECONDS).waitUntilClickable();
            evaluateJavascript("arguments[0].click();",sellOption);

        }
    }

    public void selectArrivalDate() {
        String dateString =new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        arrivalDay.withTimeoutOf(10, SECONDS).waitUntilClickable();
        String[] dateArr = dateString.split("-");
        arrivalDay.selectByValue(dateArr[0]);
        arrivalMonth.selectByValue(dateArr[1]);
        arrivalYear.selectByValue(dateArr[2]);
    }
}
