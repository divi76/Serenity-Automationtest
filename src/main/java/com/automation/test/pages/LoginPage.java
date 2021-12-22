package com.automation.test.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


@DefaultUrl("https://stagweb.eidcymru.org/en/auth/login")
public class LoginPage extends PageObject {
	private static final Logger log = LoggerFactory.getLogger(LoginPage.class);

	@FindBy(id = "username")
	WebElementFacade username;

	@FindBy(id = "password")
	WebElementFacade password;

	@FindBy(id = "submit")
	WebElementFacade submit;
	@FindBy(xpath = "//a[@href='/auth/login#auth']")
	WebElementFacade loginError;

	public void verifyTitle() {
		openUrl("https://stagweb.eidcymru.org/en/auth/login");
		assertThat(getTitle(),containsString("EIDCymru.org"));
		}
	public void login(String user, String pwd) {
		getDriver().manage().window().maximize();
		typeInto(username, user);
		typeInto(password, pwd);
		submit.click();
	}
	public void verifyInvalidLoginMsg() {
		assertThat(loginError.getText(),equalTo("Authentication Fail - Username or password may be invalid"));
	}


	public void accessLandingPage() {
		openUrl("https://stagweb.eidcymru.org/");
	}
}
