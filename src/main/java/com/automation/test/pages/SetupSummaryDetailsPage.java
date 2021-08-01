package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SetupSummaryDetailsPage extends PageObject {
    @FindBy( xpath= "//*[@id='submit']/span[contains(text(),'Setup')]")
    WebElementFacade setUp;
    public void clickOnSetup() {
        WebDriver myDriver = getDriver();
        JavascriptExecutor js = (JavascriptExecutor) myDriver;
        getDriver().manage().window().maximize();
        js.executeScript("window.scrollBy(0,1000)");
        waitFor(20);
//        setUp.click();
        evaluateJavascript("arguments[0].click();", setUp);

    }
}
