package com.automation.test.pages;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.Duration;
import java.time.temporal.ChronoUnit;

import static com.openhtmltopdf.util.Util.sleep;

@DefaultUrl("http://devc.eidcymru.org")
public class RegisterPage extends PageObject {
    private static final Logger log = LoggerFactory.getLogger(RegisterPage.class);

    @FindBy(xpath = "//*[contains(text(),'Access in English')]")
    //private WebElement accessEnglish;
    WebElementFacade accessEnglish;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElementFacade register;

    public void accessEnglish() {
        accessEnglish.click();
    }

    public void clickRegister() {
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", register);
    }

}


