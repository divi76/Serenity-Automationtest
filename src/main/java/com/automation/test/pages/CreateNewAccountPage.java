package com.automation.test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;


public class CreateNewAccountPage extends PageObject {
    @FindBy(id = "name")
    WebElementFacade name;

    @FindBy(id = "password")
    WebElementFacade password;

    @FindBy(id = "password_confirm")
    WebElementFacade confirmPassword;

    @FindBy(id = "email")
    WebElementFacade email;

    @FindBy(id = "submit")
    WebElementFacade submit;

    public void enterAccountDetails(String user, String mail, String pwd, String cpwd) {
        name.clear();
        name.type(user);

        email.clear();
        email.type(mail);

        password.clear();
        password.type(pwd);
        confirmPassword.clear();
        confirmPassword.type(cpwd);

        submit.click();

    }

}
