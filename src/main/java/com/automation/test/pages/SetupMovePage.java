package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.time.temporal.ChronoUnit.SECONDS;

public class SetupMovePage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Set up')]")
    private WebElementFacade setUp;
    @FindBy(id = "day")
    private WebElementFacade day;
    @FindBy(id = "month")
    private WebElementFacade month;
    @FindBy(id = "year")
    private WebElementFacade year;
    public void clickSetup() {

        //setUp.click();
        evaluateJavascript("arguments[0].click();",setUp);
    }
    public void selectMoveDate() {
        String dateString =new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String[] dateArr = dateString.split("-");
        day.selectByValue(dateArr[0]);
        month.selectByValue(dateArr[1]);
        year.selectByValue(dateArr[2]);
    }


}
