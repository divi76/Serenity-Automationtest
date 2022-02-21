package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Calendar;
import java.util.Date;

public class DepartureDetailsPage extends PageObject {

    @FindBy(id = "off")
    WebElementFacade continueBtn;
    public void clickContinue() {
        //continueBtn.click();
        evaluateJavascript("arguments[0].click();",continueBtn);

    }

    @FindBy(id = "day")
    WebElementFacade dayValue;
    @FindBy(id = "month")
    WebElementFacade monthValue;
    @FindBy(id = "year")
    WebElementFacade yearValue;
    public void selectTomorrowDate() {
        // get a calendar instance, which defaults to "now"
        Calendar calendar = Calendar.getInstance();

        // add one day to the date/calendar
        calendar.add(Calendar.DAY_OF_YEAR, 1);


        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        dayValue.selectByValue(String.format("%02d", Integer.parseInt(Integer.toString(day))));
        monthValue.selectByValue(String.format("%02d", Integer.parseInt(Integer.toString(month))));
        yearValue.selectByValue(String.format("%04d", Integer.parseInt(Integer.toString(year))));

    }
}
