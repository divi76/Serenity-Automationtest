package com.automation.test.pages;
import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class AccountConfirmationPage extends PageObject {
    public void verifyAccCreation() {
        assertThat( find("//h3[@class='eid-panel__title']").getText(), containsString("Account created"));
    }
}
