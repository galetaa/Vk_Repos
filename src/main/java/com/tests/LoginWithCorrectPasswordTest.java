package com.tests;

import com.tests.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertTrue;

@DisplayName("Login Test with Correct Credentials")
public class LoginWithCorrectPasswordTest extends BaseTest {

    private LoginPage loginPage;

    @Before
    public void setup() {
        super.setup();
        loginPage = new LoginPage();
    }

    @Test
    @DisplayName("User should log in with valid credentials")
    public void testSuccessLogin() {
        loginPage.open().loginAs();
        assertTrue("User should be logged in.", loginPage.isLogged());

    }
}
