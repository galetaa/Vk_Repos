package com.tests;

import com.codeborne.selenide.Configuration;
import com.tests.pages.LoginPage;
import com.tests.pages.SettingsPage;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Configuration.baseUrl;

public class ChangeThemeTest {

    private LoginPage loginPage;
    private SettingsPage settingsPage;

    @Before
    public void setup() {
        Configuration.browser = "firefox";
        baseUrl = "https://ok.ru/";

        loginPage = new LoginPage();
        settingsPage=new SettingsPage();
    }

    @Test
    public void testChangeThemeToDark() {
        loginPage.open()
                .loginAs("technopol46", "technopolisPassword");

        settingsPage.openSettingsMenu().selectDarkTheme();

    }
}
