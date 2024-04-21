package com.tests;

import com.tests.pages.LoginPage;
import com.tests.pages.SettingsPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertTrue;

@DisplayName("Change Theme To Dark Test")
public class SetDarkThemeTest extends BaseTest {

    private LoginPage loginPage;
    private SettingsPage settingsPage;

    @Before
    public void setup() {
        super.setup();
        loginPage = new LoginPage();
        settingsPage = new SettingsPage();
    }

    @Test
    @DisplayName("User should change theme to dark after logging in")
    public void changeTheme() {
        loginPage.open().loginAs();

        assertTrue("User should be logged in.", loginPage.isLogged());

        if (settingsPage.isDarkThemeActive()) {
            settingsPage.openSettingsMenu().selectDarkTheme().closeSettingsMenu();
        } else {
            settingsPage.openSettingsMenu().selectDarkTheme();
        }

        assertTrue("Theme should be changed to dark.", settingsPage.isDarkThemeActive());

    }

}
