package com.automation.test.steps;

import com.automation.test.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	private LoginPage loginPage;

	@Step
	public void verifyTitle() {
		loginPage.verifyTitle();
	}

	@Step
    public void login(String user, String password) {
		loginPage.login(user,password);
    }

	@Step
	public void verifyLoginError() {
		loginPage.verifyInvalidLoginMsg();
	}
}
