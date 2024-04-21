package com.tests;

import com.tests.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertFalse;

@DisplayName("Login Test with Wrong Credentials")
public class LoginWithWrongPasswordTest extends BaseTest {
    private static final String wrongUsername = "wrong_username";
    private static final String wrongPassword = "wrong_password";
    private LoginPage loginPage;

    @Before
    public void setup() {
        super.setup();
        loginPage = new LoginPage();
    }

    @Test
    @DisplayName("User should not log in with invalid credentials")
    public void testFailedLogin() {
        loginPage.open().loginAs(wrongUsername, wrongPassword);
        assertFalse("User should not be logged in.", loginPage.isLogged());
    }
}
