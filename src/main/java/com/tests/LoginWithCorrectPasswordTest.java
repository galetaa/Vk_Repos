package com.tests;

import com.codeborne.selenide.Configuration;
import com.tests.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Configuration.baseUrl;

public class LoginWithCorrectPasswordTest {

    private LoginPage loginPage;

    @Before
    public void setup() {
        Configuration.browser = "firefox";

        baseUrl = "https://ok.ru/";
        loginPage = new LoginPage();
    }

    @Test
    public void testSuccessLogin() {
        loginPage.open()
                .loginAs("technopol46", "technopolisPassword");
    }
}
