package com.automation.test.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;



@DefaultUrl("https://devc.eidcymru.org/en/auth/login")
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

	public void verifyTitle() throws InterruptedException {

		WebDriver myDriver = getDriver();
//		clear_cache(myDriver);
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
		openUrl("https://devc.eidcymru.org/");
	}

	public void clear_cache(WebDriver driver) throws InterruptedException {
		driver.get("chrome://settings/clearBrowserData");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(15000);
		WebElement clearData = (WebElement) js.executeScript("return document.querySelector('settings-ui').shadowRoot.querySelector('settings-main').shadowRoot.querySelector('settings-basic-page').shadowRoot.querySelector('settings-section > settings-privacy-page').shadowRoot.querySelector('settings-clear-browsing-data-dialog').shadowRoot.querySelector('#clearBrowsingDataDialog').querySelector('#clearBrowsingDataConfirm')");
		waitFor(clearData);
		clearData.click();
	}
}
