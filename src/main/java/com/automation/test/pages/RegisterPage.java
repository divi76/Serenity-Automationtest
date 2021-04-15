package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        register.click();
    }

}


