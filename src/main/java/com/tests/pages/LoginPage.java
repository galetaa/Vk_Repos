package com.tests.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    private static final String settingsMenuXPath = "//div[@class='toolbar_dropdown_w h-mod']";

    private static final String username = "technopol46";
    private static final String password = "technopolisPassword";

    public LoginPage open() {
        openPage("/");
        return this;
    }

    public void loginAs() {
        $(By.id("field_email")).setValue(username);
        $(By.id("field_password")).setValue(password);

        $(By.xpath("//input[@type='submit']")).click();
    }

    public void loginAs(String username, String password) {
        $(By.id("field_email")).setValue(username);
        $(By.id("field_password")).setValue(password);

        $(By.xpath("//input[@type='submit']")).click();
    }

    public boolean isLogged() {
        return $(By.xpath(settingsMenuXPath)).exists();
    }
}
