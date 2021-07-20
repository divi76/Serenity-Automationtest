package com.automation.test.pages;

import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyDashboardPage extends PageObject {
    public void verifyTitle() {
        assertThat(getTitle(),containsString("EIDCymru.org"));
    }
}
